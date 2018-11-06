/* A naive recursive implementation that simply follows 
the above optimal substructure property */
class exercise06 
{ 
	// Matrix Ai has dimension p[i-1] x p[i] for i = 1..n 
	static int MatrixChainOrder(int p[], int i, int j) 
	{ 
		if (i == j) 
			return 0; 

		int min = Integer.MAX_VALUE; 

		// place parenthesis at different places between first 
		// and last matrix, recursively calculate count of 
		// multiplications for each parenthesis placement and 
		// return the minimum count 
		for (int k=i; k<j; k++) 
		{ 
			int count = MatrixChainOrder(p, i, k) + 
						MatrixChainOrder(p, k+1, j) + 
						p[i-1]*p[k]*p[j]; 

			if (count < min) 
				min = count; 
		} 

		// Return minimum count 
		return min; 
	} 

	// Driver program to test above function 
	public static void main(String args[]) 
	{ 
		int arr[] = new int[] {701,1299,1424,66,75,79,198,935,166,291,1325,972,379,911,219,823,1001,615,1127,1022,543,1173,370,882,767,459,1447,915,1374,1101,550,552,931,652,62,21,98,1488,177,1105,40,1293,331,34,716,241,1478,1379,1307,745,411,657,1366,1342,252,1365,242,14,497,687,1015,1450,647,194,425,39,169,1012,457,378,653,380,1340,454,482,354,1195,1213,1052,44,728,1381,1368,1258,1041,1256,1315,1102,301,152,886,878,1464,1321,11,1408,448,63,108,608,1000,236,237,261,573,671,1072,531,756,1393,530,257,414,1087,1044,1209,908,1331,850,528,228,903,1444,126,996,76,617,361,1155,1220,618,1359,320,549,487,1034,660,1396,24,1249,162,708,605,1409,452,1136,109,689,589,1442,346,825,294,1113,527,56,978,869,1231,963,1477,1156,1174,358,328,266,731,1473,1253,435,281,136,211,1284,269,1033,599,299,853,1049,1435,1281,321,1148,102,123,68,1123,1074,782,148,1229,163,661,586,124,638,1191,1269,1204,131,209,416,587,899,1457,832,1386,1046,296,815,601,121,1017,919,498,924,1344,145,858,433,743,1452,868,227,1260,932,1283,1144,92,839,729,287,1327,73,1134,989,929,630,293,1038,264,631,752,1292,1421,78,383,727,532,1276,1345,954,325,504,987,1086,1242,887,158,412,90,855,1068,1328,699,140,391,84,259,478,1392,415,360,8,1139,918,1360,424,304,651,1277,322,1244,190,428,1439,1176,83,1060,1335,888,690,376,964,1116,1111,751,1150,181,982,994,1310,1225,472,303,603,721,717,794,255,1492,1228,375,1427,43,1146,1201,343,622,1084,1157,246,1232,1300,684,1425,582,913,821,997,574,1233,133,719,122,431,1133,1286,1125,676,1031,872,405,1131,265,1332,233,1337,561,460,1026,1159,399,1489,327,292,591,1194,553,59,1262,1432,578,1316,151,914,351,564,493,474,1227,330,125,883,950,496,423,93,814,229,1135,570,298,718,202,904,927,637,48,1472,798,46,1440,186,980,521,1388,817,1268,938,1329,1271,1303,449,364,779,112,763,864,1023,773,841,64,502,1215,662,394,1250,970,921,738,289,646,1077,138,1062,1151,540,1137,961,1196,874,933,1245,1395,54,507,612,1166,384,1008,382,1197,1446,702,595,640,709,697,1377,349,1178,1183,171,1011,665,385,655,806,1238,402,22,634,12,844,1466,417,1470,204,492,350,248,197,443,1071,641,986,523,1092,1058,1490,830,1476,441,222,859,1122,1010,52,341,309,1119,892,1263,282,29,1378,70,1352,1429,948,57,1171,546,990,510,627,232,983,925,1323,748,1188,1275,1306,520,170,557,829,666,516,1069,1412,429,831,1413,541,565,733,866,712,920,1363,787,560,1410,873,816,1261,500,367,1469,395,834,356,664,955,215,285,154,584,723,906,956,524,1453,386,182,115,238,1147,267,559,1145,907,1339,1251,940,1463,799,1259,607,146,173,69,1436,1029,774,812,32,685,1132,1059,1443,114,976,494,1079,1289,1075,710,865,220,1172,336,1468,1097,153,465,86,144,1198,1382,475,404,1177,1415,388,649,174,1312,312,714,466,479,1496,797,178,1278,1494,1385,1334,300,355,1085,900,771,165,13,207,348,284,934,621,262,397,703,1354,1018,789,807,278,1042,981,485,1398,486,836,106,366,221,971,1165,240,1467,577,439,65,1039,180,750,1423,691,583,87,525,1314,470,999,192,1070,879,110,10,747,766,1391,611,725,515,519,334,1241,49,700,1036,894,1167,1270,206,517,1056,1324,1243,1401,884,1411,1471,335,842,796,688,968,9,239,556,1479,808,650,45,567,1390,1205,1117,600,1190,1107,1164,1317,783,648,161,1279,440,1485,902,769,369,450,422,1088,340,234,430,1326,606,692,47,1202,471,1383,1163,1451,1462,793,746,962,1265,1066,203,212,619,569,696,290,1282,1387,337,535,338,1257,244,1203,205,895,678,2,695,795,143,639,418,273,1356,1455,1007,1405,1437,800,137,679,534,922,421,1218,128,214,94,736,283,585,811,704,790,1,420,1158,1199,508,464,835,802,1296,854,1212,1206,846,250,113,484,1330,533,258,175,480,1403,1192,1445,893,371,218,547,643,95,566,680,529,1040,188,1083,467,849,1361,852,1081,1222,518,668,1458,544,1373,951,890,1372,909,1063,1414,81,759,1298,593,1064,645,926,505,55,973,127,673,683,975,201,1441,1055,311,663,1397,881,1128,1216,620,885,172,15,945,734,1118,274,295,949,103,1032,310,1358,1093,1309,1294,923,624,1130,967,1461,1004,818,333,353,156,1264,1295,1240,1493,319,1235,1115,1211,314,822,820,1319,1186,120,571,1016,1082,1406,1301,764,37,677,61,488,947,1417,539,42,754,594,38,880,1142,271,31,1210,592,89,396,1375,226,1367,447,1431,372,1104,1169,119,917,243,788,231,213,1143,193,1207,1019,1480,323,41,150,522,819,101,82,1475,406,1073,722,1095,629,604,1248,3,1404,305,1497,224,77,596,352,135,602,1350,877,432,260,775,398,1091,455,985,1456,1428,377,1290,468,1035,85,359,1357,992,1027,134,368,840,581,308,765,526,870,674,251,875,1416,958,827,579,168,848,1224,609,1180,1048,317,403,1168,960,910,597,184,139,230,1402,633,739,824,1418,965,183,905,1037,867,453,476,1096,772,1103,503,1108,656,111,735,1234,686,270,1285,1239,826,141,758,1003,1226,27,410,737,426,33,698,132,538,642,941,768,88,635,1376,555,1318,1045,159,185,1474,588,749,419,235,760,491,1313,1280,998,1193,17,943,461,542,575,554,761,1109,1498,118,1006,1099,1054,1351,1302,1110,389,342,1336,672,511,957,784,930,1024,791,26,483,845,711,705,1065,1288,245,1254,1384,901,1430,1025,1255,28,1189,1380,176,1399,732,362,1043,302,1487,80,390,1355,50,720,861,253,1426,693,1179,35,1341,347,979,1362,654,263,1482,809,1120,499,1338,1051,74,316,427,1002,400,1053,977,1100,1371,1495,959,862,1400,1098,326,256,770,658,407,1067,1465,939,856,490,757,1419,249,1394,130,632,891,537,551,740,179,1161,1343,847,1076,1267,187,1230,16,1106,1112,777,1181,1185,730,117,451,434,223,477,1369,254,501,409,876,851,613,726,898,329,572,1154,436,58,669,279,786,437,408,1050,60,953,1020,444,1483,1160,1124,1149,576,1322,164,833,1287,707,272,942,995,675,1057,568,1114,536,167,1140,318,247,1438,344,277,1129,1247,1274,306,625,155,30,18,762,706,1028,1061,71,195,837,744,1449,23,776,952,991,489,413,1094,268,19,741,715,1236,288,509,339,1208,614,276,1389,315,792,1162,936,1484,191,1422,897,1304,1013,456,286,147,1089,1138,307,1014,1187,1237,1266,803,149,1121,1021,1459,1333,332,25,944,157,458,225,969,742,1214,1433,871,1005,100,1308,1273,1348,357,1305,1349,104,857,1047,804,966,753,1311,993,107,387,6,598,1320,1434,590,974,313,1291,53,1200,928,462,442,1499,1175,495,810,96,297,365,563,67,912,670,916,580,1454,1153,345,1223,445,1126,1364,988,1407,1346,1182,1141,616,785,628,473,626,838,51,558,644,610,36,1448,1078,805,72,860,636,381,506,801,99,513,208,7,843,1252,781,1420,548,1246,363,401,91,682,142,199,946,1170,160,937,1217,1272,1152,392,275,623,1460,1009,659,724,481,889,514,217,393,280,778,780,1491,97,1219,755,200,189,105,863,129,210,196,896,1080,374,1481,828,446,216,324,1030,694,1297,4,512,1370,984,20,562,463,1347,5,116,1221,667,1090,1184,438,469,813,681,545,1353,373,1486,713}; 
		int n = arr.length; 

		System.out.println("Minimum number of multiplications is "+ 
						MatrixChainOrder(arr, 1, n-1)); 

	} 
} 
/* This code is contributed by Rajat Mishra*/
