/**
 * 联动计算寒季度到年度季度汇总信息
 */
function calMB(n, char) {
	alert(n);
	alert(char);
	var v_totalMbn = $("#totalMb" + n).val();
	var v_MBN = $("#" + char + "MB" + n).val();
	//第一步先同步到年度汇总
	if(v_MBN != "") {
		$.confirm({
			'title': '确认？',
			'message': '同步到年度目标量？',
			'buttons': {
				'确定': {
					'class': 'blue',
					'action': function() {
						if(v_totalMbn != null && v_totalMbn != "") {
							v_totalMbn = parseFloat(v_totalMbn) + parseFloat(v_MBN);
						} else {
							v_totalMbn = parseFloat(v_MBN);
						}
						$("#totalMb" + n).val(v_totalMbn);
					}
				},
				'取消': {
					'class': 'gray',
					'action': function() {}
				}
			}
		});
	}
	var v_yue1 = $("#yue1" + n).val();
	var v_yue2 = $("#yue2" + n).val();
	var v_yue3 = $("#yue3" + n).val();
	var v_yue4 = $("#yue4" + n).val();
	var v_yue5 = $("#yue5" + n).val();
	var v_yue6 = $("#yue6" + n).val();
	var v_yue7 = $("#yue7" + n).val();
	var v_yue8 = $("#yue8" + n).val();
	var v_yue9 = $("#yue9" + n).val();
	var v_yue10 = $("#yue10" + n).val();
	var v_yue11 = $("#yue11" + n).val();
	var v_yue12 = $("#yue12" + n).val();
	var v_total_yue = 0;
	//第二步  同步计算完成率
	//先汇总月完成量之和
	if(char == 'H') {
		if(v_yue1 != null && v_yue1 != null) {
			v_total_yue = v_total_yue + parseFloat(v_yue1);
		}
		if(v_yue2 != null && v_yue2 != null) {
			v_total_yue = v_total_yue + parseFloat(v_yue2);
		}
	} else if(char == 'C') {
		if(v_yue3 != null && v_yue3 != "") {
			v_total_yue = v_total_yue + parseFloat(v_yue3);
		}
		if(v_yue4 != null && v_yue4 != "") {
			v_total_yue = v_total_yue + parseFloat(v_yue4);
		}
		if(v_yue51 != null && v_yue5 != "") {
			v_total_yue = v_total_yue + parseFloat(v_yue5);
		}
		if(v_yue6 != null && v_yue6 != "") {
			v_total_yue = v_total_yue + parseFloat(v_yue6);
		}
	} else if(char == 'S') {
		if(v_yue7 != null && v_yue7 != "") {
			v_total_yue = v_total_yue + parseFloat(v_yue7);
		}
		if(v_yue8 != null && v_yue8 != "") {
			v_total_yue = v_total_yue + parseFloat(v_yue8);
		}
	} else if(char == 'Q') {
		if(v_yue9 != null && v_yue9 != "") {
			v_total_yue = v_total_yue + parseFloat(v_yue9);
		}
		if(v_yue10 != null && v_yue10 != "") {
			v_total_yue = v_total_yue + parseFloat(v_yue10);
		}
		if(v_yue11 != null && v_yue11 != "") {
			v_total_yue = v_total_yue + parseFloat(v_yue11);
		}
		if(v_yue12 != null && v_yue12 != "") {
			v_total_yue = v_total_yue + parseFloat(v_yue12);
		}
	}
	var wcl = 0;
	if(v_total_yue > 0 && v_MBN > 0 && v_MBN != null && v_MBN != "") {
		wcl = v_total_yue / v_MBN / 100;
	}
	$("#" + char + "WC" + n).val(wcl);

	//同步联动更新当前一行的年度完成量
	var yearwcl = 0;
	if(v_total_yue != "" && v_total_yue != null) {
		yearwcl = v_total_yue / v_totalMbn / 100;
	}
	$("#totalWcl" + n).val(yearwcl);
}

/*
 * col  对应 行  
 * cha  对应 季度
 */
function calYUE(col, cha) {
	var yue_1 = $("#yue1" + col).val();
	var yue_2 = $("#yue2" + col).val();
	var yue_3 = $("#yue3" + col).val();
	var yue_4 = $("#yue4" + col).val();
	var yue_5 = $("#yue5" + col).val();
	var yue_6 = $("#yue6" + col).val();
	var yue_7 = $("#yue7" + col).val();
	var yue_8 = $("#yue8" + col).val();
	var yue_9 = $("#yue9" + col).val();
	var yue_10 = $("#yue10" + col).val();
	var yue_11 = $("#yue11" + col).val();
	var yue_12 = $("#yue12" + col).val();
	var v_total_mb = $("#totalMb" + col).val(); 
	var v_t_H = 0;
	var v_t_C = 0;
	var v_t_S = 0;
	var v_t_Q = 0;
	var v_t = 0;
	if(yue_1 != "" && yue_1 != null) {
		v_t_H += parseFloat(yue_1);
	}
	if(yue_2 != "" && yue_2 != null) {
		v_t_H += parseFloat(yue_2);
	}
	if(yue_3 != "" && yue_3 != null) {
		v_t_C += parseFloat(yue_3);
	}
	if(yue_4 != "" && yue_4 != null) {
		v_t_C += parseFloat(yue_4);
	}
	if(yue_5 != "" && yue_5 != null) {
		v_t_C += parseFloat(yue_5);
	}
	if(yue_6 != "" && yue_6 != null) {
		v_t_C += parseFloat(yue_6);
	}
	if(yue_7 != "" && yue_7 != null) {
		v_t_S += parseFloat(yue_7);
	}
	if(yue_8 != "" && yue_8 != null) {
		v_t_S += parseFloat(yue_8);
	}
	if(yue_9 != "" && yue_9 != null) {
		v_t_Q += parseFloat(yue_9);
	}
	if(yue_10 != "" && yue_10 != null) {
		v_t_Q += parseFloat(yue_10);
	}
	if(yue_11 != "" && yue_11 != null) {
		v_t_Q += parseFloat(yue_11);
	}
	if(yue_12 != "" && yue_12 != null) {
		v_t_Q += parseFloat(yue_12);
	}
	v_t = v_t_H + v_t_C + v_t_S + v_t_Q; 
	$("#totalWc" + col).val(v_t);
	var v_MB = $("#" + cha + "MB" + col).val(); 
	var wcl = 0;
	if(cha == 'H') {
		if(v_MB != null && v_MB != 0 && v_MB != "") {
			wcl = v_t_H / v_MB /100;
		}
	} else if(cha == 'C') {
		if(v_MB != null && v_MB != 0 && v_MB != "") {
			wcl = v_t_C / v_MB /100;
		}
	} else if(cha == 'S') {
		if(v_MB != null && v_MB != 0 && v_MB != "") {
			wcl = v_t_S / v_MB /100;
		}
	} else {
		if(v_MB != null && v_MB != 0 && v_MB != "") {
			wcl = v_t_Q / v_MB /100;
		}
	}
	wcl = 0;
	if(v_t != 0 && v_t != null && v_t != "") {
		wcl = v_t / v_total_mb /100;
	}
	$("#totalWcl" + col).val(wcl);
}