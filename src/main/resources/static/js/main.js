function groupByMonth (data) {
	
	var monthName = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];
	
	data = data.map(function (item, idx) {
		item.month = monthName[item.month-1];
		return item;
	});
	
	var groups = data.reduce(function(retValues, item) {
		(retValues[item['month']] = retValues[item['month']] || []).push(item);
		return retValues;
	}, {})
	
	var ret = [];
	for (var key in groups) {
		ret = ret.concat({
			'categorie': key,
			'values': groups[key]
		});
	}
	
	return ret;
}