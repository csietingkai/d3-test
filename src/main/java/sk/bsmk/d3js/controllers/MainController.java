package sk.bsmk.d3js.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sk.bsmk.d3js.model.YearData;

/**
 * Created by bsmk on 9/9/15.
 */
@RestController
@RequestMapping(value = "/api")
public class MainController {
	
	@RequestMapping(value = "/moneys", method = RequestMethod.GET)
	public List<YearData> getMoneys() {
		int year = 2017;
		int month = 1;
		List<YearData> datas = new ArrayList<YearData>();
		datas.add(new YearData(year, month++, 5718875));
		datas.add(new YearData(year, month++, 8147647));
		datas.add(new YearData(year, month++, 9509704));
		datas.add(new YearData(year, month++, 11378592));
		datas.add(new YearData(year, month++, 7423381));
		datas.add(new YearData(year, month++, 12357019));
		datas.add(new YearData(year, month++, 13381792));
		datas.add(new YearData(year, month++, 15816377));
		datas.add(new YearData(year, month++, 5693478));
		datas.add(new YearData(year, month++, 7492363));
		datas.add(new YearData(year, month++, 10098728));
		datas.add(new YearData(year, month, 19189064));
		month = 1;
		year++;
		datas.add(new YearData(year, month++, 5411671));
		datas.add(new YearData(year, month++, 8516109));
		datas.add(new YearData(year, month++, 15286952));
		datas.add(new YearData(year, month++, 8377544));
		datas.add(new YearData(year, month++, 9652847));
		datas.add(new YearData(year, month++, 7649903));
		datas.add(new YearData(year, month++, 12014905));
		datas.add(new YearData(year, month++, 12040838));
		datas.add(new YearData(year, month++, 8162048));
		datas.add(new YearData(year, month++, 14253947));
		datas.add(new YearData(year, month++, 6699583));
		datas.add(new YearData(year, month, 14253947));
		month = 1;
		year++;
		datas.add(new YearData(year, month++, 7875549));
		datas.add(new YearData(year, month++, 12126378));
		datas.add(new YearData(year, month++, 15753452));
		datas.add(new YearData(year, month++, 8996114));
		datas.add(new YearData(year, month++, 9785666));
		datas.add(new YearData(year, month++, 9699151));
		datas.add(new YearData(year, month++, 5901139));
		datas.add(new YearData(year, month++, 7389498));
		datas.add(new YearData(year, month++, 2394081));
		datas.add(new YearData(year, month++, 429872));
		datas.add(new YearData(year, month++, 13894973));
		datas.add(new YearData(year, month, 324897));
		return datas;
	}
}
