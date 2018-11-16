(function (params) {
    var instruments;

    $.ajax({
        type : 'GET',
        url : 'lab/names',
        success : function (d) {
            $.each(d, function (i, val) {
                var option = document.createElement('option');
                option.label = val.name;
                option.value = val.id;
                option.text = val.name;
                $('#lab-select').append(option);
            });
            initLabSelect();
            initInventorySelect();
        },
        error : function (d) {
            window.alert("fetching list of laboratory names failed.")
        }
    });

    function initLabSelect() {
        $('#lab-select').change(function () {
            loadLabInventories(this.value);
        });
    }

    function loadLabInventories(labName) {
        $.ajax({
            type : 'GET',
            url : 'inventory?labName=' + labName,
            success : function (d) {
                $('#inventory-select').empty();
                var option = document.createElement('option');
                option.label = '';
                option.value = 0;
                option.text = '';
                $('#inventory-select').append(option);
                $.each(d, function (i, val) {
                    var option = document.createElement('option');
                    option.label = val.name;
                    option.value = val.id;
                    option.text = val.name;
                    $('#inventory-select').append(option);
                });
            },
            error : function (d) {
                window.alert("fetching list of inventories failed.")
            }
        });
    }

    function initInventorySelect() {
        $('#inventory-select').change(function () {
            getInstruments(this.value);
        });
    }

    function getInstruments(inventoryNo) {
        $.ajax({
            type : 'GET',
            url : 'instruments/list?inventoryNo=' + (inventoryNo || 0),
            success : function (d) {
                instruments = d;
                drawInstruments(d);
                initializeSearchBox();
            },
            error : function (d) {
                window.alert("fetching list of instruments failed.")
            }
        });
    }

    function drawInstruments(instruments) {
        var dummyRow = $('#dummy-table-row').clone();
        $('#table-content').html('');
        $('#search-results-table').append(dummyRow);
        $.each(instruments, function (i, d) {
            var newRow = $('#dummy-table-row').clone();
            var sNo = newRow.children('#s-no');
            var itemName = newRow.children('#item-name');
            var itemBrand = newRow.children('#item-brand');
            sNo.html(d.sno);
            itemName.html(d.name);
            itemBrand.html(d.brand);
            sNo.attr('id', 's-no-' + i);
            itemName.attr('id', 'item-name-' + i);
            itemBrand.attr('id', 'item-brand-' + i);
            newRow.attr('id', 'row-' + i);
            $('#search-results-table').append(newRow);
            newRow.show();
        });

    }

    function initializeSearchBox() {
        $('#search-box').on('keyup', function () {
            var searchTerm = this.value;
            $.ajax({
                type : 'GET',
                url : 'lab/instruments/byname?labName=test&instrumentName=' + searchTerm,
                success : function (d) {
                    instruments = d;
                    drawInstruments(d);
                },
                error : function (d) {
                    window.alert("fetching list of instruments failed.")
                }
            });
        });
    }
})();