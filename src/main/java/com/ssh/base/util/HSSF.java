package com.ssh.base.util;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import antlr.StringUtils;

import com.sun.rowset.internal.Row;

public class HSSF {
	/**
	 * formdatamodel对象导入excel并推送至页面下载
	 * 
	 * @param request
	 * @param response
	 */
	/*public void exportToExcel(HttpServletRequest request,
			HttpServletResponse response) {
		response.reset();
		response.setContentType("application/vnd.ms-excel;charset=utf-8");
		String fileName = "file1";
		HSSFWorkbook excel = exportToExcel("");
		try {
			response.setHeader("Content-Disposition", "attachment;filename="+ new String((fileName + ".xls").getBytes(), "iso-8859-1"));
			ServletOutputStream out = response.getOutputStream();
			excel.write(out);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				excel.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}*/
	
	@Test
	public void writeToExcel(){
		try {
			XSSFWorkbook workbook = new XSSFWorkbook();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//把formDataModel写入一个excel中
	private HSSFWorkbook exportToExcel(String json) {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();// excel表
		HSSFCellStyle cellStyleHead = workbook.createCellStyle();// 表头单元格样式
		cellStyleHead.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		cellStyleHead.setWrapText(true);//单元格包围文本
		cellStyleHead.setFillPattern(HSSFCellStyle.FINE_DOTS);
		cellStyleHead.setFillForegroundColor(new HSSFColor.YELLOW().getIndex());//excel表头颜色，前景色和背景色要同事设置
		cellStyleHead.setFillBackgroundColor(new HSSFColor.YELLOW().getIndex());
		cellStyleHead.setBorderBottom((short) 1);//excel表头边框
		cellStyleHead.setBorderTop((short) 1);
		cellStyleHead.setBorderLeft((short) 1);
		cellStyleHead.setBorderRight((short) 1);   
		
		return workbook;
	}
	/*//写入formDataModel中的表头或表数据，exportToExcel方法用到
	private int addLines(HSSFSheet sheet, AbstractCTableBody absbody,
			int startIndex, HSSFCellStyle cellStyle) {
		Row row = null;
		Cell cell = null;
		List<CTableCell> cells = new ArrayList<CTableCell>();
		Object value = null;
		int endIndex = 0;//结束行
		for (int index = 0; index < absbody.getLines().size(); index++) {
			row = sheet.createRow(startIndex + index);
			cells = absbody.getLines().get(index).getCells();
			for (int j = 0; j < cells.size(); j++) {
				cell = row.createCell(j);
				cell.setCellStyle(cellStyle);
				value = cells.get(j).getValue();
				//这里把数字型的都按Number保存，避免单元格出现左上角箭头
				if (value instanceof Integer) {
					cell.setCellType(0);// 0:Number 1:String ...
					cell.setCellValue((int) value);
				} else if (value instanceof Double || value instanceof Float) {
					cell.setCellType(0);// 0:Number 1:String ...
					cell.setCellValue((double) value);
				} else if (value instanceof BigDecimal) {
					cell.setCellType(0);// 0:Number 1:String ...
					cell.setCellValue(((BigDecimal) value).doubleValue());
				} else {
					cell.setCellValue(cells.get(j).getDisplayValue());
				}
				sheet.autoSizeColumn(j);
			}
			endIndex++;
		}
		return endIndex;
	}*/
}
