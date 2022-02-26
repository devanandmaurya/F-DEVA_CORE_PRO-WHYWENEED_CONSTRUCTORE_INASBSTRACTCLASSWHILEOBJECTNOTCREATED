package com.main;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Connection.Myconnection;

public class CreatQuey {
	public static String bank_error_msg;

	public static long transation_id;
	public static BigDecimal Amount;
	public static String bank_id;
	public static String bank_msg;
	public static String bank_name;
	public static String billing_address;
	public static String card_data;
	public static BigDecimal cgst_amount;
	public static String channel_type;
	public static BigDecimal commison;
	public static long commision_id;
	public static String commision_type;
	public static Date created_date;
	public static String customer_name;
	public static String transaction_date_time;
	public static String email_id;
	public static BigDecimal igst_amount;
	public static long merchant_id;
	public static String merchant_name;
	public static long merchant_setting_id;
	public static String merchant_txn_id;
	public static String mobile;
	public static Date modified_date;
	public static String order_discription;
	public static String order_number;
	public static String payment_mode;
	public static String pos_id;
	public static String processor;
	public static String processor_code;
	public static String processor_tx_reference;
	public static String processor_txn_id;
	public static String product_id;
	public static String productType;
	public static String processor_recon_status;
	public static String refund_status;
	public static String remarks;
	public static String response_code;
	public static String return_url;
	public static String processor_settlement_amount;
	// public static String processor_settlement_date;
	public static String settlement_ref_no;
	public static int settlement_status;
	public static BigDecimal sgst_amount;
	public static String stage;
	public static String terminal_id;
	public static BigDecimal total_refunded_amount;

	public static String transaction_status;
	public static String transaction_currency;
	public static String udf1;
	public static String udf2;
	public static String udf3;
	public static String udf4;
	public static String udf5;
	public static String udf10;
	public static String udf6;
	public static String udf7;
	public static String udf8;
	public static String udf9;
	public static String count;
	public static String txnType;

	public static void main(String[] args) {
		try {

			Connection con = Myconnection.myConnectionMethod();
			String sql = "select * from transaction_log where created_date between '2019-07-22' and  '2020-11-19'";
			Statement ps = con.createStatement();

			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				transation_id = rs.getLong(1);
				Amount = rs.getBigDecimal(2);
				bank_error_msg = rs.getString(3);
				bank_id = rs.getString(4);
				bank_msg = rs.getString(5);
				bank_name = rs.getString(6);
				billing_address = rs.getString(7);
				card_data = rs.getString(8);
				cgst_amount = rs.getBigDecimal(9);
				channel_type = rs.getString(10);
				commison = rs.getBigDecimal(11);
				commision_id = rs.getLong(12);
				commision_type = rs.getString(13);
				created_date = rs.getDate(14);
				customer_name = rs.getString(15);
				transaction_date_time = rs.getString(16);
				email_id = rs.getString(17);
				igst_amount = rs.getBigDecimal(18);
				merchant_id = rs.getLong(19);
				merchant_name = rs.getString(20);
				merchant_setting_id = rs.getLong(21);
				merchant_txn_id = rs.getString(22);
				mobile = rs.getString(23);
				modified_date = rs.getDate(24);
				order_discription = rs.getString(25);
				order_number = rs.getString(26);
				payment_mode = rs.getString(27);
				pos_id = rs.getString(28);
				processor = rs.getString(29);
				processor_code = rs.getString(30);
				processor_tx_reference = rs.getString(31);
				processor_txn_id = rs.getString(32);
				product_id = rs.getString(33);
				productType = rs.getString(34);
				processor_recon_status = rs.getString(35);
				refund_status = rs.getString(36);
				remarks = rs.getString(37);
				response_code = rs.getString(38);
				response_code = rs.getString(39);
				return_url = rs.getString(40);
				processor_settlement_amount = rs.getString(41);
				// processor_settlement_date = rs.getString(42);
				settlement_ref_no = rs.getString(42);
				settlement_status = rs.getInt(43);
				sgst_amount = rs.getBigDecimal(44);
				stage = rs.getString(45);
				terminal_id = rs.getString(46);
				total_refunded_amount = rs.getBigDecimal(47);
				transaction_status = rs.getString(48);
				transaction_currency = rs.getString(49);
				udf1 = rs.getString(50);
				udf2 = rs.getString(49);
				udf3 = rs.getString(50);
				udf4 = rs.getString(51);
				udf5 = rs.getString(52);
				udf10 = rs.getString(53);
				udf6 = rs.getString(54);
				udf7 = rs.getString(55);
				udf8 = rs.getString(56);
				udf9 = rs.getString(57);
				count = rs.getString(58);
				txnType = rs.getString(59);
				System.out.println("transation_id: " + transation_id + " Amount: " + Amount + " bank_error_msg: "
						+ bank_error_msg + "bank_id:  " + bank_id + "bank_msg: " + bank_msg

						+ "bank_name:" + bank_name + "billing_address: " + billing_address + " card_data: " + card_data
						+ "cgst_amount: " + cgst_amount + "channel_type:" + channel_type + "commison: " + commison
						+ "commision_id: " + commision_id + "commision_type: " + commision_type + "created_date: "
						+ created_date + "customer_name: " + customer_name + "transaction_date_time:"
						+ transaction_date_time + "email_id:" + email_id + "igst_amount: " + igst_amount
						+ " merchant_id : " + merchant_id + " merchant_name: " + merchant_name + "merchant_setting_id:"
						+ merchant_setting_id + "merchant_txn_id: " + merchant_txn_id + "mobile: " + mobile
						+ " modified_date: " + modified_date + "order_discription: " + order_discription
						+ "order_number: " + order_number + "payment_mode:" + payment_mode + "pos_id: " + pos_id
						+ "processor: " + processor + "processor_code:" + processor_code + "processor_tx_reference:"
						+ processor_tx_reference + "processor_txn_id: " + processor_txn_id + "product_id: " + product_id
						+ "productType :" + productType + "processor_recon_status:" + processor_recon_status
						+ "refund_status:" + refund_status + "remarks:" + remarks + "response_code:" + response_code
						+ "return_url:" + return_url + "processor_settlement_amount:" + processor_settlement_amount

						// "processor_settlement_date:"+processor_settlement_date

						+ " settlement_ref_no: " + settlement_ref_no + settlement_ref_no + " settlement_ref_no: "
						+ "settlement_status:" + settlement_status + "sgst_amount: " + sgst_amount + " stage :" + stage
						+ "terminal_id: " + terminal_id + " total_refunded_amount: " + total_refunded_amount
						+ " transaction_status:" + transaction_status + "transaction_currency:" + transaction_currency
						+ " udf1 : " + udf1 + " udf2: " + udf2 + " udf3:" + udf3 + " udf4:" + udf4 + " udf5: " + udf5
						+ " udf10 :" + udf10 + " udf6: " + udf6 + " udf7:" + udf7 + " udf8:" + udf9 + " count:+count"
						+ " txnType: " + txnType);

			}

			con.close();
		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}
