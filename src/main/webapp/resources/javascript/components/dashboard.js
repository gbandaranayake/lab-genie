(function (params) {
    var instruments;
    $.ajax({
        type : 'GET',
        url : 'lab/instruments?labName=test',
        success : function (d) {
            instruments = d;
            drawInstruments(d);
        },
        error : function (d) {
            window.alert("fetching list of instruments failed.")
        }
    });

    function drawInstruments(instruments) {
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
})();