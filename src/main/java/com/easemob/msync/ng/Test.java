package com.easemob.msync.ng;

public class Test {
	private static String MR = "$MR$"; //]
	private static String ML = "$ML$"; //[
	private static String LR = "$LR$"; //}
	private static String LL = "$LL$"; //{
	public static void main(String[] args) {
		 
        String str = "{msync,$ML$$LL$$LR$,$LL$$MR$$LR$,$LL$all_checks, $ML$health_check_conn_num,health_check_kafka,health_check_lager,health_check_process_queue,health_check_redis,health_check_session,health_check_worker_num$MR$$LR$,$LL$apollo_appid,\"easemob-im-msync\"$LR$,$LL$apollo_cluster_name,\"hsb\"$LR$,$LL$apollo_config_button,shutdown$LR$,$LL$apollo_config_server_url,\"10.81.8.250:28080\"$LR$,$LL$apollo_local_config_path,\"./msync.config\"$LR$,$LL$apollo_namespace_name,\"application\"$LR$,$LL$apollo_notification_id,-1$LR$,$LL$apollo_path,\"./msync.config\"$LR$,$LL$apollo_wait_time, 60000$LR$,$LL$appkey_traffic_control,$ML$$ML$$LL$name, appkey_traffic_control_login$LR$$MR$,$ML$$LL$name, appkey_traffic_control_chat$LR$$MR$,$ML$$LL$name, appkey_traffic_control_group_chat$LR$,$LL$ticket_speed, 10000000$LR$$MR$,$ML$$LL$name, appkey_traffic_control_muc_presence$LR$,$LL$ticket_speed, 10000000$LR$$MR$$MR$$LR$,$LL$appkey_traffic_control_default,$ML$$LL$ticket_max_factor, 5.0$LR$,$LL$ticket_speed, -1$LR$$MR$$LR$,$LL$authorized_sock_opts, $ML$$LL$packet_size,65536$LR$$MR$$LR$,$LL$cluster, bcssy$LR$,$LL$conference_expiration_ms, 15000$LR$,$LL$conn_num_limit, 100000$LR$,$LL$enable_media_request_transfer, true$LR$,$LL$enable_message_down_queue, false$LR$,$LL$enable_message_limit_queue, false$LR$,$LL$enable_multi_devices, false$LR$,$LL$enable_session_db_hotswap, true$LR$,$LL$etcdc, $ML$$LL$enable_etcd_service_disc, false$LR$$MR$$LR$,$LL$health_monitor_period, 6000000$LR$,$LL$health_server, $ML$$LL$host, \"localhost\"$LR$,$LL$path, \"/health\"$LR$,$LL$port, \"8080\"$LR$$MR$$LR$,$LL$http_proxy,none$LR$,$LL$httpc_timeout, 10000$LR$,$LL$is_msync, true$LR$,$LL$media_server_port, 6666$LR$,$LL$message_down_features, $ML$message_down_readmsg$MR$$LR$,$LL$message_down_queue,$ML$$LL$member_num_to_down_speed,$ML$$LL$0,1000$LR$,$LL$1000,30$LR$,$LL$3000,10$LR$,$LL$6000,10$LR$$MR$$LR$,$LL$member_num_to_push,10000$LR$,$LL$rate_list,$ML$$LL$0,0$LR$,$LL$2000,0$LR$,$LL$2001,80$LR$$MR$$LR$,$LL$read, true$LR$,$LL$refresh_interval, 60000$LR$,$LL$sleep_time, 1000$LR$,$LL$speed,100000$LR$$MR$$LR$,$LL$message_down_readmsg, $ML$kafka_message_down_large_chatroom_normal,kafka_message_down_large_chatroom_low,kafka_message_down_large_group_normal$MR$$LR$,$LL$message_limit_queue,$ML$$LL$kafka_key, kafka_message_limit_queue$LR$,$LL$queue_num, 10$LR$,$LL$queue_type, kafka$LR$,$LL$redis_key, message_limit_queue$LR$,$LL$redis_topic_prefix, <<\"msync:msg:queue:\">>$LR$$MR$$LR$,$LL$mod_message_limit,$ML$$LL$member_num_to_down_speed,$ML$$LL$0,1000$LR$,$LL$1000,30$LR$,$LL$3000,10$LR$$MR$$LR$,$LL$rate_list,$ML$$LL$0,0$LR$,$LL$2000,0$LR$,$LL$2001,80$LR$$MR$$LR$,$LL$read, true$LR$,$LL$refresh_interval, 60000$LR$,$LL$sleep_time, 1000$LR$,$LL$speed,5000$LR$,$LL$statistics_expire_time, 1000$LR$$MR$$LR$,$LL$modules,$ML$$LL$mod_easemob_restart,$ML$$MR$$LR$$MR$$LR$,$LL$msync_worker, $ML$worker$MR$$LR$,$LL$node_roles_list, $ML$worker_nodes$MR$$LR$,$LL$node_type, rest_normal$LR$,$LL$odbc_ping_threshold, 100000$LR$,$LL$opentracing_list, $ML$\"user\"$MR$$LR$,$LL$opentracing_probability, one_out_of, 2$LR$,$LL$pid_path, \"/data/apps/var/msync/msync.pid\"$LR$,$LL$port, 6717$LR$,$LL$process_queue_warn_len, 200$LR$,$LL$redis_ping_threshold, 100000$LR$,$LL$rest_batch_chat, $ML$$LL$db, 0$LR$,$LL$host, \"redis\"$LR$,$LL$port, 6379$LR$,$LL$topic_name, \"im:rest:batch:chat\"$LR$$MR$$LR$,$LL$rest_batch_chat_groups, $ML$rest_batch_chat, rest_kefu$MR$$LR$,$LL$rest_batch_groupchat, $ML$$LL$db, 0$LR$,$LL$host, \"redis\"$LR$,$LL$port, 6379$LR$,$LL$topic_name, \"im:rest:batch:groupchat\"$LR$$MR$$LR$,$LL$rest_batch_groupchat_groups, $ML$rest_batch_groupchat$MR$$LR$,$LL$rest_kefu, $ML$$LL$db, 0$LR$,$LL$host, \"redis\"$LR$,$LL$port, 6379$LR$,$LL$topic_name, \"im:rest:kefu:chat\"$LR$$MR$$LR$,$LL$rest_kefu_groups, $ML$rest_kefu$MR$$LR$,$LL$rest_msg,$ML$$LL$redis_chat_topic,$ML$<<\"im:rest:chat\">>$MR$$LR$,$LL$redis_groupchat_topic,$ML$<<\"im:rest:groupchat\">>$MR$$LR$,$LL$redis_host,<<\"redis\">>$LR$,$LL$redis_port,6379$LR$$MR$$LR$,$LL$rest_normal,  $ML$rest_normal_chat_groups, rest_normal_groupchat_groups, worker,mod,mod_easemob_restart$LR$,$LL$rest_normal_chat, $ML$$LL$db, 0$LR$,$LL$host, \"redis\"$LR$,$LL$port, 6379$LR$,$LL$topic_name, \"im:rest:chat\"$LR$$MR$$LR$,$LL$rest_normal_chat_groups, $ML$rest_normal_chat, rest_kefu$MR$$LR$,$LL$rest_normal_groupchat, $ML$$LL$db, 0$LR$,$LL$host, \"redis\"$LR$,$LL$port, 6379$LR$,$LL$topic_name, \"im:rest:groupchat\"$LR$$MR$$LR$,$LL$rest_normal_groupchat_groups, $ML$rest_normal_groupchat$MR$$LR$,$LL$sendmsg_chat_features, $ML$rest_batch_chat_groups, rest_kefu_groups, rest_normal_chat_groups$MR$$LR$,$LL$sendmsg_groupchat_features, $ML$rest_batch_groupchat_groups, rest_kefu_groups, rest_normal_groupchat_groups$MR$$LR$,$LL$session_counter, false$LR$,$LL$session_db_type, redis$LR$,$LL$session_ping_threshold, 100000$LR$,$LL$shaper, $ML$$LL$fast,50000$LR$,$LL$normal,3000$LR$,$LL$rest,$ML$$LL$ batch, 6000$LR$,$LL$normal, 10000$LR$$MR$$LR$$MR$$LR$,$LL$sock_opts, $ML$$LL$backlog, 4096$LR$,$LL$nodelay, true$LR$,$LL$other_options, $ML$$LL$buffer, 1460$LR$,$LL$exit_on_close,true$LR$,$LL$keepalive, true$LR$,$LL$packet_size,4096$LR$,$LL$send_timeout, 15000$LR$,$LL$send_timeout_close,true$LR$,$LL$sndbuf,4096$LR$$MR$$LR$,$LL$recbuf, 4096$LR$$MR$$LR$,$LL$store_node_roles, $ML$$LL$worker_nodes, $ML$<<\"msync@hsb-ali-beijing-mesos-slave3\">>$MR$$LR$$MR$$LR$,$LL$store_nodes,$ML$$LL$muc,$ML$$MR$$LR$$MR$$LR$,$LL$turnServers,$ML$$LL$<<\"easemob.com\">>, $ML$\"52.52.125.47:3478\"$MR$$LR$$MR$$LR$,$LL$user_auth_module, msync_user_with_poolboy$LR$,$LL$worker_num_limit, 100$LR$$MR$},{ticktick,$ML$$LL$ip, \"0.0.0.0\"$LR$,$LL$machine_id, 501 $LR$,$LL$port, 18080$LR$$MR$}";

        String result = str.replace(MR, "]").replace(ML, "[").replace(LR, "}").replace(LL, "{");
    	System.out.println("=========>" + result);
    }
 
    public static void sortString(String[] arr) {
 
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
 
                if(arr[i].compareTo(arr[j])>0)//字符串比较用compareTo方法
                    swap(arr,i,j);
            }
        }
    }
 
    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                System.out.print(arr[i] + ", ");
            else
                System.out.println(arr[i] + "]");
        }
    }
}
