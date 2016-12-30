package com.sesame.heart.bean;

import java.util.List;

/**
 * 心理圈 列表
 * Created by Administrator on 2016/12/23.
 */
public class MindBean {

    /**
     * errorCode : 0
     * errorStr : success
     * resultCount : 30
     * score : 0
     * balance : 0
     * results : [{"id":"30579","userid":"1592","nickname":"心灵伴侣","avatar":"http://image.xinliji.me/FuNo5F0DsUXNks7sMx6UAyEczd4D","isConsultant":"1","canDel":"0","isAnon":"0","viewCnt":"6920","likeCnt":"23","isLiked":"1","commentCnt":"15","location":"","content":"秀恩爱美图，赢情趣大床！就在平安夜！就在我心APP！","createdDate":1481955973,"createdDateLabel":"2016/12/17","canShare":"0","shareUrl":"","photos":[{"url":"http://image.xinliji.me/4ab98129-e468-4beb-a2e8-45d6b052cdaa?imageView2/0/w/800","width":"533","height":"800"}],"comments":[{"id":"98915","userid":"77237","avatar":"http://icon.xinliji.me//avatar_0_105.png","nickname":"兰朵","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"警察蜀黍，这里有人虐狗∪･ω･∪","createdDate":1481958011,"createdDateLabel":"2016/12/17"},{"id":"99006","userid":"122682","avatar":"http://image.xinliji.me/FsVnlJs3BcGsp0DQ_kmndWkVbD8x","nickname":"吖呆","isAnon":"0","isConsultant":"0","replyUserid":"77237","replyNickname":"兰朵","replyIsAnon":"0","replyIsConsultant":"","content":"哈哈😊","createdDate":1481987353,"createdDateLabel":"2016/12/17"},{"id":"99217","userid":"51773","avatar":"http://image.xinliji.me/FsVzB-yW_UJlZZiqvrOPKlIYUZZB","nickname":"乔瑞峰","isAnon":"0","isConsultant":"1","replyUserid":"77237","replyNickname":"兰朵","replyIsAnon":"0","replyIsConsultant":"","content":"虽然我是单身，也想有个人和我一起秀恩爱，晒晒照片。","createdDate":1482048705,"createdDateLabel":"2016/12/18"},{"id":"99266","userid":"120147","avatar":"http://image.xinliji.me/Fhf70BozOW1SS3To723sd1XTuqdI","nickname":"张瑞生","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"不明觉厉，也不想虐狗，我就是想在这里粗线一下","createdDate":1482055406,"createdDateLabel":"2016/12/18"},{"id":"99296","userid":"78228","avatar":"http://image.xinliji.me/FptOO05Xzs2FnF6pLN_97uQ0YKPf","nickname":"李丽霞","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"老年不宜。闪。","createdDate":1482067739,"createdDateLabel":"2016/12/18"},{"id":"99324","userid":"7287","avatar":"http://image.xinliji.me//FtrWfJM9GHm68-L-B-7cxv0E6O8u","nickname":"硬汉","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"马上去找女朋友秀恩爱😊","createdDate":1482075009,"createdDateLabel":"2016/12/18"},{"id":"99341","userid":"108599","avatar":"http://image.xinliji.me/o_1atr3lspr1p831sibiiv9lqveki.jpg","nickname":"李兆汝","isAnon":"0","isConsultant":"1","replyUserid":"78228","replyNickname":"李丽霞","replyIsAnon":"0","replyIsConsultant":"1","content":"情侣可以一辈子😉","createdDate":1482108585,"createdDateLabel":"2016/12/19"},{"id":"99343","userid":"78228","avatar":"http://image.xinliji.me/FptOO05Xzs2FnF6pLN_97uQ0YKPf","nickname":"李丽霞","isAnon":"0","isConsultant":"1","replyUserid":"108599","replyNickname":"李兆汝","replyIsAnon":"0","replyIsConsultant":"1","content":"😜","createdDate":1482108742,"createdDateLabel":"2016/12/19"},{"id":"99392","userid":"122682","avatar":"http://image.xinliji.me/FsVnlJs3BcGsp0DQ_kmndWkVbD8x","nickname":"吖呆","isAnon":"0","isConsultant":"0","replyUserid":"78228","replyNickname":"李丽霞","replyIsAnon":"0","replyIsConsultant":"1","content":"老年也需要浪漫😁😁","createdDate":1482115885,"createdDateLabel":"2016/12/19"},{"id":"99399","userid":"78228","avatar":"http://image.xinliji.me/FptOO05Xzs2FnF6pLN_97uQ0YKPf","nickname":"李丽霞","isAnon":"0","isConsultant":"1","replyUserid":"122682","replyNickname":"吖呆","replyIsAnon":"0","replyIsConsultant":"","content":"😂","createdDate":1482116265,"createdDateLabel":"2016/12/19"},{"id":"99482","userid":"122682","avatar":"http://image.xinliji.me/FsVnlJs3BcGsp0DQ_kmndWkVbD8x","nickname":"吖呆","isAnon":"0","isConsultant":"0","replyUserid":"78228","replyNickname":"李丽霞","replyIsAnon":"0","replyIsConsultant":"1","content":"怎么啦😳😳😳","createdDate":1482142980,"createdDateLabel":"2016/12/19"},{"id":"99929","userid":"124599","avatar":"http://image.xinliji.me/FufmWq70lfXapcC067SogtIO28iA","nickname":"九天霹雳小次郎","isAnon":"0","isConsultant":"0","replyUserid":"7287","replyNickname":"硬汉","replyIsAnon":"0","replyIsConsultant":"","content":"快去快去","createdDate":1482284331,"createdDateLabel":"前天"},{"id":"100063","userid":"81483","avatar":"http://image.xinliji.me/Fh0blr_PRxL6vnDMuz7ncxdxD4JP","nickname":"俞红叶","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"默默围观一下","createdDate":1482315733,"createdDateLabel":"昨天"},{"id":"100095","userid":"102513","avatar":"http://image.xinliji.me/o_1ascib3k91uf4fq0h2e159gccsi.jpg","nickname":"张海燕","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"一定要放闪 不限性别 求同秀","createdDate":1482321508,"createdDateLabel":"昨天"},{"id":"100258","userid":"91305","avatar":"http://icon.xinliji.me/anon.png","nickname":"上海网友","isAnon":"1","isConsultant":"0","replyUserid":"77237","replyNickname":"兰朵","replyIsAnon":"0","replyIsConsultant":"","content":"生日快乐","createdDate":1482366104,"createdDateLabel":"昨天"}],"viewType":"image"},{"id":"31023","userid":"124291","nickname":"宇凡妈咪™","avatar":"http://image.xinliji.me/FiaspGsi4BoQ4r0RwbnelepAFtMd","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"3","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"我都有点怀疑是不是有点抑郁症...","createdDate":1482462787,"createdDateLabel":"2分钟前","canShare":"0","shareUrl":"","viewType":"text"},{"id":"31022","userid":"122682","nickname":"吖呆","avatar":"http://image.xinliji.me/FsVnlJs3BcGsp0DQ_kmndWkVbD8x","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"12","likeCnt":"0","isLiked":"1","commentCnt":"1","location":"","content":"大家早安😊😊😊😊😊","createdDate":1482462476,"createdDateLabel":"8分钟前","canShare":"0","shareUrl":"","comments":[{"id":"100559","userid":"124865","avatar":"http://image.xinliji.me/o_1b4db6ii01670mli1mb1b2j1ca0i.jpg","nickname":"李瑛","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"午安","createdDate":1482462539,"createdDateLabel":"7分钟前"}],"viewType":"text"},{"id":"31021","userid":"125192","nickname":"ZXJQ！ZASH！","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEKRE96oZ0QibVt4W0iaERQhO99Oq6rrxnZfKibFUl7E20U0icVxOo5O9cEG3bMeRoWodd6qiaaTpew5jDQ/0","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"54","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"一个人的成就，不是以金钱衡量，而是一生中，你善待过多少人，有多少人怀念你。生意人的账簿，记录收入与支出，两数相减，便是盈利。人生的账簿，记录爱与被爱，两数相加，就是成就[呲牙]人生最幸福的事、莫过于有人信你、有人爱你、有人懂你、有人牵挂你[害羞]太久没发圈了，冒个泡[呲牙]其实我很好！","createdDate":1482459916,"createdDateLabel":"50分钟前","canShare":"0","shareUrl":"","photos":[{"url":"http://image.xinliji.me/f851bd89-a989-4ac0-9ae7-c55752568b87?imageView2/0/w/800","width":"640","height":"1137"},{"url":"http://image.xinliji.me/e2c10f8e-8119-4dec-a970-2b1155caea1b?imageView2/0/w/800","width":"800","height":"800"},{"url":"http://image.xinliji.me/8888846c-9de4-433c-98bb-aa40cecee115?imageView2/0/w/800","width":"800","height":"800"}],"viewType":"image"},{"id":"31019","userid":"114004","nickname":"仪苑","avatar":"FtIcNjnUyl-VmncC1BWcz4J-knh9","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"80","likeCnt":"1","isLiked":"1","commentCnt":"0","location":"","content":"我也想说，只要我们心中还有爱，我们的相处方式可以调整。      只可惜我们都不能直视真正的问题所在，认为自己永远是对的。","createdDate":1482458382,"createdDateLabel":"1小时前","canShare":"0","shareUrl":"","photos":[{"url":"http://image.xinliji.me/FjNgccno9rhFaWukd4ufGCR3XH8X?imageView2/0/w/800","width":"1136","height":"758"}],"viewType":"image"},{"id":"31018","userid":"113427","nickname":"广州网友","avatar":"http://icon.xinliji.me/anon.png","isConsultant":"0","canDel":"0","isAnon":"1","viewCnt":"87","likeCnt":"0","isLiked":"1","commentCnt":"1","location":"","content":"我住在叔叔婶婶家，我真的不知道为什么我男朋友会怀疑我跟我叔叔发生性关系，他简直就是神经病","createdDate":1482458097,"createdDateLabel":"1小时前","canShare":"0","shareUrl":"","comments":[{"id":"100557","userid":"114301","avatar":"http://q.qlogo.cn/qqapp/1104104412/2E12652CF2416673407A9832AFEC2FEC/100","nickname":"薄樱鬼","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"你男朋友真是人才啊，这都怀疑，在一起又有什么意思呢。","createdDate":1482460255,"createdDateLabel":"45分钟前"}],"viewType":"text"},{"id":"31017","userid":"123354","nickname":"易苑","avatar":"http://image.xinliji.me/FpN3pjTkPdMXcBut9IJ1RDry_LD2","isConsultant":"1","canDel":"0","isAnon":"0","viewCnt":"116","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"本来很开心的一个早上，大家在一起讨论圣诞节该怎么收拾自己，可是总有那种人看不得其乐融融的氛围，硬生生把这场讨论拉到消费观不同上，最后各自散了，好心情也没，不开心！","createdDate":1482457025,"createdDateLabel":"1小时前","canShare":"0","shareUrl":"","photos":[{"url":"http://image.xinliji.me/Fgh-tiKTWfKH2tncpfu0VG2JG7PV?imageView2/0/w/800","width":"959","height":"1280"}],"viewType":"image"},{"id":"31016","userid":"125192","nickname":"ZXJQ！ZASH！","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEKRE96oZ0QibVt4W0iaERQhO99Oq6rrxnZfKibFUl7E20U0icVxOo5O9cEG3bMeRoWodd6qiaaTpew5jDQ/0","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"142","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"真心对真爱。有你真可爱。爱情万岁。","createdDate":1482455790,"createdDateLabel":"1小时前","canShare":"0","shareUrl":"","photos":[{"url":"http://image.xinliji.me/2cf6b969-ede1-4e04-b98b-290a76e013b0?imageView2/0/w/800","width":"720","height":"1280"},{"url":"http://image.xinliji.me/c41bce93-6b93-4268-93df-5ca465b09539?imageView2/0/w/800","width":"640","height":"640"},{"url":"http://image.xinliji.me/a8b6fc76-5cc9-4b93-8dc9-397431f33b37?imageView2/0/w/800","width":"637","height":"400"},{"url":"http://image.xinliji.me/801e10d2-1659-40d7-9992-22d21b0886d6?imageView2/0/w/800","width":"581","height":"1114"},{"url":"http://image.xinliji.me/739090e4-3a2a-4752-90fb-5d4437508c1b?imageView2/0/w/800","width":"500","height":"316"},{"url":"http://image.xinliji.me/3637d215-7625-4864-be86-1102a8930932?imageView2/0/w/800","width":"612","height":"612"},{"url":"http://image.xinliji.me/c672dfcb-ff8f-449f-beb1-b9108664ce3a?imageView2/0/w/800","width":"500","height":"316"}],"viewType":"image"},{"id":"31015","userid":"91305","nickname":"上海网友","avatar":"http://icon.xinliji.me/anon.png","isConsultant":"0","canDel":"0","isAnon":"1","viewCnt":"147","likeCnt":"0","isLiked":"1","commentCnt":"2","location":"","content":"为什么会梦到你？还是一连串的梦境里有你","createdDate":1482455530,"createdDateLabel":"2小时前","canShare":"0","shareUrl":"","comments":[{"id":"100543","userid":"123354","avatar":"http://image.xinliji.me/FpN3pjTkPdMXcBut9IJ1RDry_LD2","nickname":"易苑","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"梦到了就联系吧","createdDate":1482457072,"createdDateLabel":"1小时前"},{"id":"100551","userid":"123393","avatar":"http://wx.qlogo.cn/mmopen/fhicotyX5dAeGXDgHpZjY8Vtjx3Hq1gHE25iaYL0iaewzCzT6Uf526kTqrtYibmFFUW2l9FDTD7zNK4n2H49asNibicQ/0","nickname":"小静儿","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"昨晚我也梦到了，但我还是不敢联系，再等等吧，或许会有意外惊喜，人常说梦都是反的，不要那么急着联系吧","createdDate":1482457489,"createdDateLabel":"1小时前"}],"viewType":"text"},{"id":"31014","userid":"61837","nickname":"金猫","avatar":"http://icon.xinliji.me//avatar_1_101.png","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"150","likeCnt":"0","isLiked":"1","commentCnt":"1","location":"","content":"医生嘱咐我8:30吃药，我常常9:00吃，，，","createdDate":1482455464,"createdDateLabel":"2小时前","canShare":"0","shareUrl":"","comments":[{"id":"100544","userid":"125297","avatar":"http://q.qlogo.cn/qqapp/1104104412/7AC4D2E68DE2B2BB268A6B116E551CD5/100","nickname":"要么瘦要么死","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"额哦","createdDate":1482457165,"createdDateLabel":"1小时前"}],"viewType":"text"},{"id":"31013","userid":"123393","nickname":"小静儿","avatar":"http://wx.qlogo.cn/mmopen/fhicotyX5dAeGXDgHpZjY8Vtjx3Hq1gHE25iaYL0iaewzCzT6Uf526kTqrtYibmFFUW2l9FDTD7zNK4n2H49asNibicQ/0","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"152","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"我不知道现在我是该喜还是该悲，该喜是我总认为的事情是虚惊一场，该悲是他依然对我没有回应，一想到以前的种种美好，我都忍不住的好想他好想联系他","createdDate":1482455285,"createdDateLabel":"2小时前","canShare":"0","shareUrl":"","viewType":"text"},{"id":"31012","userid":"119498","nickname":"郁闷","avatar":"http://image.xinliji.me/FnQyDu5bKK9LSFBWHid7NXVXPZlq","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"190","likeCnt":"0","isLiked":"1","commentCnt":"17","location":"","content":"纠结，老公出轨后回来了，承认了错误，原谅了他。但是他不碰我。为什么？","createdDate":1482454441,"createdDateLabel":"2小时前","canShare":"0","shareUrl":"","comments":[{"id":"100525","userid":"125192","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEKRE96oZ0QibVt4W0iaERQhO99Oq6rrxnZfKibFUl7E20U0icVxOo5O9cEG3bMeRoWodd6qiaaTpew5jDQ/0","nickname":"ZXJQ！ZASH！","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"对你没有爱了","createdDate":1482454918,"createdDateLabel":"2小时前"},{"id":"100526","userid":"119498","avatar":"http://image.xinliji.me/FnQyDu5bKK9LSFBWHid7NXVXPZlq","nickname":"郁闷","isAnon":"0","isConsultant":"0","replyUserid":"125192","replyNickname":"ZXJQ！ZASH！","replyIsAnon":"0","replyIsConsultant":"","content":"也许吧，那他回来做什么","createdDate":1482454940,"createdDateLabel":"2小时前"},{"id":"100527","userid":"125192","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEKRE96oZ0QibVt4W0iaERQhO99Oq6rrxnZfKibFUl7E20U0icVxOo5O9cEG3bMeRoWodd6qiaaTpew5jDQ/0","nickname":"ZXJQ！ZASH！","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"为了孩子。放不下孩子","createdDate":1482455007,"createdDateLabel":"2小时前"},{"id":"100528","userid":"119498","avatar":"http://image.xinliji.me/FnQyDu5bKK9LSFBWHid7NXVXPZlq","nickname":"郁闷","isAnon":"0","isConsultant":"0","replyUserid":"125192","replyNickname":"ZXJQ！ZASH！","replyIsAnon":"0","replyIsConsultant":"","content":"但我们每天睡觉都会拥抱，也会亲吻","createdDate":1482455050,"createdDateLabel":"2小时前"},{"id":"100529","userid":"125192","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEKRE96oZ0QibVt4W0iaERQhO99Oq6rrxnZfKibFUl7E20U0icVxOo5O9cEG3bMeRoWodd6qiaaTpew5jDQ/0","nickname":"ZXJQ！ZASH！","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"你和他吗？有性爱吗？他有主动吗","createdDate":1482455121,"createdDateLabel":"2小时前"},{"id":"100530","userid":"119498","avatar":"http://image.xinliji.me/FnQyDu5bKK9LSFBWHid7NXVXPZlq","nickname":"郁闷","isAnon":"0","isConsultant":"0","replyUserid":"125192","replyNickname":"ZXJQ！ZASH！","replyIsAnon":"0","replyIsConsultant":"","content":"他会抱我，亲我。","createdDate":1482455143,"createdDateLabel":"2小时前"},{"id":"100531","userid":"125192","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEKRE96oZ0QibVt4W0iaERQhO99Oq6rrxnZfKibFUl7E20U0icVxOo5O9cEG3bMeRoWodd6qiaaTpew5jDQ/0","nickname":"ZXJQ！ZASH！","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"那有做爱吗","createdDate":1482455192,"createdDateLabel":"2小时前"},{"id":"100532","userid":"119498","avatar":"http://image.xinliji.me/FnQyDu5bKK9LSFBWHid7NXVXPZlq","nickname":"郁闷","isAnon":"0","isConsultant":"0","replyUserid":"125192","replyNickname":"ZXJQ！ZASH！","replyIsAnon":"0","replyIsConsultant":"","content":"没有","createdDate":1482455204,"createdDateLabel":"2小时前"},{"id":"100533","userid":"125192","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEKRE96oZ0QibVt4W0iaERQhO99Oq6rrxnZfKibFUl7E20U0icVxOo5O9cEG3bMeRoWodd6qiaaTpew5jDQ/0","nickname":"ZXJQ！ZASH！","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"他身体没问题吗？就是工作压力大","createdDate":1482455265,"createdDateLabel":"2小时前"},{"id":"100534","userid":"119498","avatar":"http://image.xinliji.me/FnQyDu5bKK9LSFBWHid7NXVXPZlq","nickname":"郁闷","isAnon":"0","isConsultant":"0","replyUserid":"125192","replyNickname":"ZXJQ！ZASH！","replyIsAnon":"0","replyIsConsultant":"","content":"没有问题，工作也没有压力","createdDate":1482455299,"createdDateLabel":"2小时前"},{"id":"100535","userid":"125192","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEKRE96oZ0QibVt4W0iaERQhO99Oq6rrxnZfKibFUl7E20U0icVxOo5O9cEG3bMeRoWodd6qiaaTpew5jDQ/0","nickname":"ZXJQ！ZASH！","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"那你主动。他会做吗","createdDate":1482455348,"createdDateLabel":"2小时前"},{"id":"100536","userid":"119498","avatar":"http://image.xinliji.me/FnQyDu5bKK9LSFBWHid7NXVXPZlq","nickname":"郁闷","isAnon":"0","isConsultant":"0","replyUserid":"125192","replyNickname":"ZXJQ！ZASH！","replyIsAnon":"0","replyIsConsultant":"","content":"不会","createdDate":1482455470,"createdDateLabel":"2小时前"},{"id":"100537","userid":"125192","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEKRE96oZ0QibVt4W0iaERQhO99Oq6rrxnZfKibFUl7E20U0icVxOo5O9cEG3bMeRoWodd6qiaaTpew5jDQ/0","nickname":"ZXJQ！ZASH！","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"那他心里有人。不能放弃你。这就不对了。你要好好问问","createdDate":1482455657,"createdDateLabel":"2小时前"},{"id":"100538","userid":"119498","avatar":"http://image.xinliji.me/FnQyDu5bKK9LSFBWHid7NXVXPZlq","nickname":"郁闷","isAnon":"0","isConsultant":"0","replyUserid":"125192","replyNickname":"ZXJQ！ZASH！","replyIsAnon":"0","replyIsConsultant":"","content":"好，谢谢你","createdDate":1482456110,"createdDateLabel":"1小时前"},{"id":"100548","userid":"36971","avatar":"http://image.xinliji.me/FgjtpzXsJQuJmF9g0YO6SiiHSisc","nickname":"趙健兵","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"涉及隐私的问题，找咨询师私聊\u2026\u2026","createdDate":1482457382,"createdDateLabel":"1小时前"},{"id":"100549","userid":"124865","avatar":"http://image.xinliji.me/o_1b4db6ii01670mli1mb1b2j1ca0i.jpg","nickname":"李瑛","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"人回来了，心没有全回。","createdDate":1482457387,"createdDateLabel":"1小时前"},{"id":"100556","userid":"123393","avatar":"http://wx.qlogo.cn/mmopen/fhicotyX5dAeGXDgHpZjY8Vtjx3Hq1gHE25iaYL0iaewzCzT6Uf526kTqrtYibmFFUW2l9FDTD7zNK4n2H49asNibicQ/0","nickname":"小静儿","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"那他对你还是不错的，至少还会抱你亲你，","createdDate":1482459954,"createdDateLabel":"50分钟前"}],"viewType":"text"},{"id":"31011","userid":"27582","nickname":"吴晨瑶","avatar":"http://image.xinliji.me/FhZxtTcwsYo1lqAcksNEzYI5K_AT","isConsultant":"1","canDel":"0","isAnon":"0","viewCnt":"182","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"世界再灰暗，仍想保持内心晴空一片。雾霾天安心在家接个案","createdDate":1482453146,"createdDateLabel":"2小时前","canShare":"0","shareUrl":"","photos":[{"url":"http://image.xinliji.me/FkMc6JLp_Gnsu6SMB7tzdQ0r6tWI?imageView2/0/w/800","width":"1242","height":"2208"}],"viewType":"image"},{"id":"31009","userid":"119684","nickname":"刘兵","avatar":"http://image.xinliji.me/o_1b2lc0hlj1lmnmf914pp1s9p1arbi.jpg","isConsultant":"1","canDel":"0","isAnon":"0","viewCnt":"201","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"在各种关系中，尤其是亲密关系中，我们时常表现的非常矛盾：既依恋对方又害怕对方走近，既讨好顺从又十分愤怒。在被过往的经验塑造的行为模式中，我们熟悉已有的伤口的味道，往往无法发展新的应对策略，一有风吹草动即刻逃入旧有的模式中。而强迫性重复虽然会带来短暂的掌控感甚至是愉悦感，但最终是持久的无助感和失控感，无力摆脱重复的命运。早安。","createdDate":1482452236,"createdDateLabel":"2小时前","canShare":"0","shareUrl":"","viewType":"text"},{"id":"31008","userid":"125285","nickname":"..","avatar":"http://q.qlogo.cn/qqapp/1104104412/6D1E0F4D0219E888BA21F289487D9B66/100","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"210","likeCnt":"0","isLiked":"1","commentCnt":"5","location":"","content":"我第一次找到这个平台实在是闷的不行了！看了那么久的病没看出个什么不知道哪里出了问题整天睡不着觉神经衰弱脾气暴躁没人诉说！玩手机还玩的头疼胳膊疼家里也对我放弃了！到底是辐射啊还是心理啊还是抑郁啊！！","createdDate":1482452146,"createdDateLabel":"3小时前","canShare":"0","shareUrl":"","comments":[{"id":"100512","userid":"125285","avatar":"http://q.qlogo.cn/qqapp/1104104412/6D1E0F4D0219E888BA21F289487D9B66/100","nickname":"..","isAnon":"0","isConsultant":"0","replyUserid":"114301","replyNickname":"薄樱鬼","replyIsAnon":"0","replyIsConsultant":"","content":"我感觉我快了","createdDate":1482452516,"createdDateLabel":"2小时前"},{"id":"100516","userid":"125285","avatar":"http://q.qlogo.cn/qqapp/1104104412/6D1E0F4D0219E888BA21F289487D9B66/100","nickname":"..","isAnon":"0","isConsultant":"0","replyUserid":"114301","replyNickname":"薄樱鬼","replyIsAnon":"0","replyIsConsultant":"","content":"当然痛苦了家人看到你这样应该比我更痛苦我就是无力去做那些事情了","createdDate":1482452833,"createdDateLabel":"2小时前"},{"id":"100519","userid":"27582","avatar":"http://image.xinliji.me/FhZxtTcwsYo1lqAcksNEzYI5K_AT","nickname":"吴晨瑶","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"哪里看的病，医生怎么说","createdDate":1482453235,"createdDateLabel":"2小时前"},{"id":"100522","userid":"125285","avatar":"http://q.qlogo.cn/qqapp/1104104412/6D1E0F4D0219E888BA21F289487D9B66/100","nickname":"..","isAnon":"0","isConsultant":"0","replyUserid":"27582","replyNickname":"吴晨瑶","replyIsAnon":"0","replyIsConsultant":"1","content":"济南这边的医院！有说抑郁有说没事！但还是不好  可能是管不住自己玩手机！我还有救么","createdDate":1482453471,"createdDateLabel":"2小时前"},{"id":"100523","userid":"125285","avatar":"http://q.qlogo.cn/qqapp/1104104412/6D1E0F4D0219E888BA21F289487D9B66/100","nickname":"..","isAnon":"0","isConsultant":"0","replyUserid":"27582","replyNickname":"吴晨瑶","replyIsAnon":"0","replyIsConsultant":"1","content":"吃了不是嗜睡就是小毛病多了！有次差点睡过去","createdDate":1482453530,"createdDateLabel":"2小时前"}],"viewType":"text"},{"id":"31007","userid":"125257","nickname":"久人依旧。","avatar":"http://q.qlogo.cn/qqapp/1104104412/FAB98FE6DB0ED4F250F4C221DD2C8C7D/100","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"208","likeCnt":"0","isLiked":"1","commentCnt":"1","location":"","content":"是有点无聊。","createdDate":1482451826,"createdDateLabel":"3小时前","canShare":"0","shareUrl":"","comments":[{"id":"100547","userid":"125192","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEKRE96oZ0QibVt4W0iaERQhO99Oq6rrxnZfKibFUl7E20U0icVxOo5O9cEG3bMeRoWodd6qiaaTpew5jDQ/0","nickname":"ZXJQ！ZASH！","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"我们这一生，要走很多条路，有笔直坦途，有羊肠阡陌；有春天的风景，有冬季的荒凉。无论如何，路要自己走，苦要自己吃，别人无法帮忙。仰望满天的繁星，回望留下的脚印，我们一直在孤独中跋涉，在寂寞里坚守。只要你愿意走，踩过的都是路；只要你不回避与退缩，生命的掌声终会为你响起zxJQ一个人就算再好，但不愿陪你走下去，那他就是过客；一个人就算有再多缺点，可能处处忍让你，陪你到最后，那就是终点。都想找个十全十美的爱人，但人总有缺点。所以，生活其实很简单。就是找一个你愿意忍受他的人，又能一起走到最后。爱情就是相互忍，彼此真，过一生！就像生活，就像爱情，就像婚姻，是永远的永恒话题，永远没有定论，因为任何这其中的一件都是牵一发而动全身。所以，一个人要真正的去理解感情这件事，就永远不要执着于自己的感情本身，否则永远不可能理解。","createdDate":1482457356,"createdDateLabel":"1小时前"}],"viewType":"text"},{"id":"31006","userid":"125280","nickname":"梦🍬","avatar":"http://wx.qlogo.cn/mmopen/HQwPDTAnNiabPyN3GDvoEOOUIQg7MPicS2mNUY005JaZicoZPhwZk7Dn1umkSo6rpricgA475IE1AUx3FswRTvPISPicBXyqBSBSj/0","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"237","likeCnt":"0","isLiked":"1","commentCnt":"8","location":"","content":"怎么才能让我放下手机呢？","createdDate":1482450310,"createdDateLabel":"3小时前","canShare":"0","shareUrl":"","comments":[{"id":"100502","userid":"124886","avatar":"http://q.qlogo.cn/qqapp/1104104412/C3603EBFE8D688598CEA35EFC022982D/100","nickname":"顺其自然","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"从心里放下，那也就放下了","createdDate":1482450922,"createdDateLabel":"3小时前"},{"id":"100503","userid":"125280","avatar":"http://wx.qlogo.cn/mmopen/HQwPDTAnNiabPyN3GDvoEOOUIQg7MPicS2mNUY005JaZicoZPhwZk7Dn1umkSo6rpricgA475IE1AUx3FswRTvPISPicBXyqBSBSj/0","nickname":"梦🍬","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"白说呀","createdDate":1482451084,"createdDateLabel":"3小时前"},{"id":"100504","userid":"31670","avatar":"http://image.xinliji.me/FtuyGWfcampSST0XTN-WZynlIi-Z","nickname":"包宇黎","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"你一天花在看手机上的时间有多少？","createdDate":1482451485,"createdDateLabel":"3小时前"},{"id":"100510","userid":"114301","avatar":"http://q.qlogo.cn/qqapp/1104104412/2E12652CF2416673407A9832AFEC2FEC/100","nickname":"薄樱鬼","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"把手机摔了","createdDate":1482452405,"createdDateLabel":"2小时前"},{"id":"100511","userid":"125280","avatar":"http://wx.qlogo.cn/mmopen/HQwPDTAnNiabPyN3GDvoEOOUIQg7MPicS2mNUY005JaZicoZPhwZk7Dn1umkSo6rpricgA475IE1AUx3FswRTvPISPicBXyqBSBSj/0","nickname":"梦🍬","isAnon":"0","isConsultant":"0","replyUserid":"31670","replyNickname":"包宇黎","replyIsAnon":"0","replyIsConsultant":"1","content":"出了吃饭睡觉！","createdDate":1482452408,"createdDateLabel":"2小时前"},{"id":"100513","userid":"125285","avatar":"http://q.qlogo.cn/qqapp/1104104412/6D1E0F4D0219E888BA21F289487D9B66/100","nickname":"..","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"知音","createdDate":1482452551,"createdDateLabel":"2小时前"},{"id":"100520","userid":"31670","avatar":"http://image.xinliji.me/FtuyGWfcampSST0XTN-WZynlIi-Z","nickname":"包宇黎","isAnon":"0","isConsultant":"1","replyUserid":"125280","replyNickname":"梦🍬","replyIsAnon":"0","replyIsConsultant":"","content":"嗯嗯、那遇到什么问题了，让你想要放下它？","createdDate":1482453236,"createdDateLabel":"2小时前"},{"id":"100521","userid":"27582","avatar":"http://image.xinliji.me/FhZxtTcwsYo1lqAcksNEzYI5K_AT","nickname":"吴晨瑶","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"试着关机10分钟感觉一下","createdDate":1482453325,"createdDateLabel":"2小时前"}],"viewType":"text"},{"id":"31005","userid":"123539","nickname":"孤血望魂回","avatar":"http://tva2.sinaimg.cn/crop.0.0.438.438.50/006DCnRwjw8fapvl7vbhwj30c60c6dfw.jpg","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"226","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"给那些黑心不良医生、黑医院、包庇掩护不良医生的医院编一首描写把医院当土匪山寨建设的诗\u2014\u2014\u201c医院我来搞，用药经我找。尔要把命保，献够大红包。\u201d","createdDate":1482450091,"createdDateLabel":"3小时前","canShare":"0","shareUrl":"","photos":[{"url":"http://image.xinliji.me/5b3f3198-f341-4835-b9be-3c5cf908bdd6?imageView2/0/w/800","width":"800","height":"450"}],"viewType":"image"},{"id":"31004","userid":"125192","nickname":"ZXJQ！ZASH！","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEKRE96oZ0QibVt4W0iaERQhO99Oq6rrxnZfKibFUl7E20U0icVxOo5O9cEG3bMeRoWodd6qiaaTpew5jDQ/0","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"237","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"我们这一生，要走很多条路，有笔直坦途，有羊肠阡陌；有春天的风景，有冬季的荒凉。无论如何，路要自己走，苦要自己吃，别人无法帮忙。仰望满天的繁星，回望留下的脚印，我们一直在孤独中跋涉，在寂寞里坚守。只要你愿意走，踩过的都是路；只要你不回避与退缩，生命的掌声终会为你响起zxJQ一个人就算再好，但不愿陪你走下去，那他就是过客；一个人就算有再多缺点，可能处处忍让你，陪你到最后，那就是终点。都想找个十全十美的爱人，但人总有缺点。所以，生活其实很简单。就是找一个你愿意忍受他的人，又能一起走到最后。爱情就是相互忍，彼此真，过一生！就像生活，就像爱情，就像婚姻，是永远的永恒话题，永远没有定论，因为任何这其中的一件都是牵一发而动全身。所以，一个人要真正的去理解感情这件事，就永远不要执着于自己的感情本身，否则永远不可能理解。","createdDate":1482447626,"createdDateLabel":"4小时前","canShare":"0","shareUrl":"","photos":[{"url":"http://image.xinliji.me/1b877d8a-e3fb-4a16-bad7-ddefcfb12c29?imageView2/0/w/800","width":"640","height":"853"},{"url":"http://image.xinliji.me/f76eb4b1-34c9-456f-a937-95bb04c27486?imageView2/0/w/800","width":"800","height":"1130"},{"url":"http://image.xinliji.me/d60a167d-2b96-40fc-acba-fbac1684702a?imageView2/0/w/800","width":"800","height":"1130"}],"viewType":"image"},{"id":"31002","userid":"125280","nickname":"梦🍬","avatar":"http://wx.qlogo.cn/mmopen/HQwPDTAnNiabPyN3GDvoEOOUIQg7MPicS2mNUY005JaZicoZPhwZk7Dn1umkSo6rpricgA475IE1AUx3FswRTvPISPicBXyqBSBSj/0","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"251","likeCnt":"0","isLiked":"1","commentCnt":"8","location":"","content":"想死！但舍不得自己！","createdDate":1482445772,"createdDateLabel":"4小时前","canShare":"0","shareUrl":"","comments":[{"id":"100490","userid":"36971","avatar":"http://image.xinliji.me/FgjtpzXsJQuJmF9g0YO6SiiHSisc","nickname":"趙健兵","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"那就好好活着\u2026\u2026","createdDate":1482446166,"createdDateLabel":"4小时前"},{"id":"100492","userid":"125280","avatar":"http://wx.qlogo.cn/mmopen/HQwPDTAnNiabPyN3GDvoEOOUIQg7MPicS2mNUY005JaZicoZPhwZk7Dn1umkSo6rpricgA475IE1AUx3FswRTvPISPicBXyqBSBSj/0","nickname":"梦🍬","isAnon":"0","isConsultant":"0","replyUserid":"36971","replyNickname":"趙健兵","replyIsAnon":"0","replyIsConsultant":"1","content":"没有一个理由让我活下去！","createdDate":1482447489,"createdDateLabel":"4小时前"},{"id":"100493","userid":"119250","avatar":"http://q.qlogo.cn/qqapp/1104104412/583DE1F480775865CCC58D5B5A87145F/100","nickname":"右手的誓言","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"为了你的父母","createdDate":1482449333,"createdDateLabel":"3小时前"},{"id":"100494","userid":"125280","avatar":"http://wx.qlogo.cn/mmopen/HQwPDTAnNiabPyN3GDvoEOOUIQg7MPicS2mNUY005JaZicoZPhwZk7Dn1umkSo6rpricgA475IE1AUx3FswRTvPISPicBXyqBSBSj/0","nickname":"梦🍬","isAnon":"0","isConsultant":"0","replyUserid":"119250","replyNickname":"右手的誓言","replyIsAnon":"0","replyIsConsultant":"","content":"可我感觉他们不管我了对我没了信心","createdDate":1482449382,"createdDateLabel":"3小时前"},{"id":"100496","userid":"119250","avatar":"http://q.qlogo.cn/qqapp/1104104412/583DE1F480775865CCC58D5B5A87145F/100","nickname":"右手的誓言","isAnon":"0","isConsultant":"0","replyUserid":"125280","replyNickname":"梦🍬","replyIsAnon":"0","replyIsConsultant":"","content":"没有父母不疼爱自己的孩子  你是有一个结，这个结没有打开，心放宽了，想通了就好。","createdDate":1482449490,"createdDateLabel":"3小时前"},{"id":"100497","userid":"125280","avatar":"http://wx.qlogo.cn/mmopen/HQwPDTAnNiabPyN3GDvoEOOUIQg7MPicS2mNUY005JaZicoZPhwZk7Dn1umkSo6rpricgA475IE1AUx3FswRTvPISPicBXyqBSBSj/0","nickname":"梦🍬","isAnon":"0","isConsultant":"0","replyUserid":"119250","replyNickname":"右手的誓言","replyIsAnon":"0","replyIsConsultant":"","content":"哎！我每次也是这么想可是每次开导完自己转眼看见他们所作所为反而更强烈了！","createdDate":1482449614,"createdDateLabel":"3小时前"},{"id":"100524","userid":"36971","avatar":"http://image.xinliji.me/FgjtpzXsJQuJmF9g0YO6SiiHSisc","nickname":"趙健兵","isAnon":"0","isConsultant":"1","replyUserid":"125280","replyNickname":"梦🍬","replyIsAnon":"0","replyIsConsultant":"","content":"舍不得自己就是最好的理由\u2026\u2026","createdDate":1482454589,"createdDateLabel":"2小时前"},{"id":"100545","userid":"123354","avatar":"http://image.xinliji.me/FpN3pjTkPdMXcBut9IJ1RDry_LD2","nickname":"易苑","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"死的勇气都有还没有活下去的勇气？","createdDate":1482457247,"createdDateLabel":"1小时前"}],"viewType":"text"},{"id":"30999","userid":"117029","nickname":"刘雨鑫","avatar":"http://image.xinliji.me/FjGJ4KRcDuSAXf_IcjR90sWEdtJo","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"256","likeCnt":"0","isLiked":"1","commentCnt":"3","location":"","content":"每晚都做梦，不过梦境还挺有趣挺荒唐。但是有人说，掐一下就知道你是不是在做梦了。我很费解。因为做梦我也有触觉，听觉，嗅觉。而且每天的梦都能回忆起。也并没有给我带来睡眠压力","createdDate":1482442132,"createdDateLabel":"5小时前","canShare":"0","shareUrl":"","comments":[{"id":"100488","userid":"117029","avatar":"http://image.xinliji.me/FjGJ4KRcDuSAXf_IcjR90sWEdtJo","nickname":"刘雨鑫","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"在梦中我也能有  味觉\n有人说大脑没有回忆和幻想味道的能力，是吗？那为什么我能轻而易举回忆起食物的味道，并且能想象自己没吃过的食物的味道（不仅仅是酸和甜是具体的）你们可以吗","createdDate":1482442863,"createdDateLabel":"5小时前"},{"id":"100505","userid":"114301","avatar":"http://q.qlogo.cn/qqapp/1104104412/2E12652CF2416673407A9832AFEC2FEC/100","nickname":"薄樱鬼","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"很正常，我也是这样，并且梦里悲伤醒来就悲伤梦里快乐醒来也快乐。","createdDate":1482451897,"createdDateLabel":"3小时前"},{"id":"100506","userid":"114301","avatar":"http://q.qlogo.cn/qqapp/1104104412/2E12652CF2416673407A9832AFEC2FEC/100","nickname":"薄樱鬼","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"我喜欢做梦，喜欢梦中的无忧无虑，喜欢梦中没有束缚，可是随着年龄的增长，梦越来越少。","createdDate":1482451960,"createdDateLabel":"3小时前"}],"viewType":"text"},{"id":"30998","userid":"125277","nickname":"孝感网友","avatar":"http://icon.xinliji.me/anon.png","isConsultant":"0","canDel":"0","isAnon":"1","viewCnt":"263","likeCnt":"0","isLiked":"1","commentCnt":"1","location":"","content":"一个自认为熟的人欺骗啦你心情不好过感觉挺恨他","createdDate":1482439281,"createdDateLabel":"6小时前","canShare":"0","shareUrl":"","comments":[{"id":"100491","userid":"36971","avatar":"http://image.xinliji.me/FgjtpzXsJQuJmF9g0YO6SiiHSisc","nickname":"趙健兵","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"淡定\u2026\u2026","createdDate":1482446201,"createdDateLabel":"4小时前"}],"viewType":"text"},{"id":"30997","userid":"43984","nickname":"张柏和","avatar":"http://image.xinliji.me//o_1a3kqv5231kb01l8vq8dthkf6ui.png","isConsultant":"1","canDel":"0","isAnon":"0","viewCnt":"283","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"刚才和我通电话的姑娘你好，老师很惦念你。如果你方便可以再打电话过来，我不知道你的电话。联系不上你 。客服现在都睡了。我打电话也没联系上。在这里留言。希望你能看到。然后联系我。或者明天联系我。我们继续沟通 好吗。","createdDate":1482432934,"createdDateLabel":"8小时前","canShare":"0","shareUrl":"","viewType":"text"},{"id":"30996","userid":"107398","nickname":"他是命🍂不是梦","avatar":"http://image.xinliji.me/FgNo5GAMO0cYCMplUk1xe_mMqL05","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"294","likeCnt":"0","isLiked":"1","commentCnt":"2","location":"","content":"表面上很幸福，但我真的不快乐\u2026\u2026","createdDate":1482428675,"createdDateLabel":"9小时前","canShare":"0","shareUrl":"","comments":[{"id":"100487","userid":"43984","avatar":"http://image.xinliji.me//o_1a3kqv5231kb01l8vq8dthkf6ui.png","nickname":"张柏和","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"你好。是不是我们刚刚通电话的啊？","createdDate":1482432979,"createdDateLabel":"8小时前"},{"id":"100558","userid":"114301","avatar":"http://q.qlogo.cn/qqapp/1104104412/2E12652CF2416673407A9832AFEC2FEC/100","nickname":"薄樱鬼","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"不快乐就去寻找快乐。","createdDate":1482460338,"createdDateLabel":"43分钟前"}],"viewType":"text"},{"id":"30995","userid":"124865","nickname":"李瑛","avatar":"http://image.xinliji.me/o_1b4db6ii01670mli1mb1b2j1ca0i.jpg","isConsultant":"1","canDel":"0","isAnon":"0","viewCnt":"326","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"在亲密关系中，展现真实的自己，就是彼此看见的开始，也是真正沟通的开始。晚安。","createdDate":1482425664,"createdDateLabel":"10小时前","canShare":"0","shareUrl":"","photos":[{"url":"http://image.xinliji.me/FlQvIwjvBlL2WyGZcDfTe3ZCNiYk?imageView2/0/w/800","width":"928","height":"960"}],"viewType":"image"},{"id":"30994","userid":"121334","nickname":"赵飞飞","avatar":"http://image.xinliji.me/FnoaW8Zdml0DCbDOjdQlLXJIkRkh","isConsultant":"1","canDel":"0","isAnon":"0","viewCnt":"334","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"真正的风险是，共同生活在一个屋檐下数年，却从不曾确实认识彼此的灵魂。真正的风险是，只知维持建立在物质条件和表面功夫上的婚姻，却回避最重要的人性关怀和牵系。你永远不会因爱而输，却常输在不敢去爱。","createdDate":1482425109,"createdDateLabel":"10小时前","canShare":"0","shareUrl":"","photos":[{"url":"http://image.xinliji.me/2a616b32-4045-4fb4-847e-b27532634e69?imageView2/0/w/800","width":"540","height":"960"}],"viewType":"image"},{"id":"30993","userid":"107398","nickname":"他是命🍂不是梦","avatar":"http://image.xinliji.me/FgNo5GAMO0cYCMplUk1xe_mMqL05","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"336","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"男朋友他跟他好玩的去女生家里睡觉，他每次叫我从来玩都什么话都很少讲，他的好朋友对我还有很大的意见，虽然我不知道为什么，可能是我真的不给他面子，把他弄的这么尴尬，","createdDate":1482424881,"createdDateLabel":"10小时前","canShare":"0","shareUrl":"","viewType":"text"},{"id":"30991","userid":"125259","nickname":"这个冬天开冷气","avatar":"http://wx.qlogo.cn/mmopen/8mq7ciamtialUEbyjsundpUxuWMR3R0qroIcTs4wpTxV6jp0Zd4enrFmWFBS2UuCzPTicEpOXe9jag6ktBqicaG0f4F4dIcWFo7e/0","isConsultant":"0","canDel":"0","isAnon":"0","viewCnt":"337","likeCnt":"0","isLiked":"1","commentCnt":"1","location":"","content":"总是找不到女朋友","createdDate":1482424791,"createdDateLabel":"10小时前","canShare":"0","shareUrl":"","comments":[{"id":"100500","userid":"125280","avatar":"http://wx.qlogo.cn/mmopen/HQwPDTAnNiabPyN3GDvoEOOUIQg7MPicS2mNUY005JaZicoZPhwZk7Dn1umkSo6rpricgA475IE1AUx3FswRTvPISPicBXyqBSBSj/0","nickname":"梦🍬","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"该来会来","createdDate":1482450153,"createdDateLabel":"3小时前"}],"viewType":"text"},{"id":"30990","userid":"121334","nickname":"赵飞飞","avatar":"http://image.xinliji.me/FnoaW8Zdml0DCbDOjdQlLXJIkRkh","isConsultant":"1","canDel":"0","isAnon":"0","viewCnt":"339","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"","createdDate":1482424745,"createdDateLabel":"10小时前","canShare":"0","shareUrl":"","photos":[{"url":"http://image.xinliji.me/4bec6733-d9d1-45a9-9e92-210c1e3508a3?imageView2/0/w/800","width":"911","height":"1620"}],"viewType":"image"},{"id":"30989","userid":"121334","nickname":"赵飞飞","avatar":"http://image.xinliji.me/FnoaW8Zdml0DCbDOjdQlLXJIkRkh","isConsultant":"1","canDel":"0","isAnon":"0","viewCnt":"341","likeCnt":"0","isLiked":"1","commentCnt":"0","location":"","content":"婚姻是日复一日，年复一年的抉择，婚姻是动词，婚姻不是你要得到的东西，而是一件你要努力付出的事。","createdDate":1482424658,"createdDateLabel":"10小时前","canShare":"0","shareUrl":"","viewType":"text"}]
     */

    private String errorCode;
    private String errorStr;
    private String resultCount;
    private String score;
    private String balance;
    /**
     * id : 30579
     * userid : 1592
     * nickname : 心灵伴侣
     * avatar : http://image.xinliji.me/FuNo5F0DsUXNks7sMx6UAyEczd4D
     * isConsultant : 1
     * canDel : 0
     * isAnon : 0
     * viewCnt : 6920
     * likeCnt : 23
     * isLiked : 1
     * commentCnt : 15
     * location :
     * content : 秀恩爱美图，赢情趣大床！就在平安夜！就在我心APP！
     * createdDate : 1481955973
     * createdDateLabel : 2016/12/17
     * canShare : 0
     * shareUrl :
     * photos : [{"url":"http://image.xinliji.me/4ab98129-e468-4beb-a2e8-45d6b052cdaa?imageView2/0/w/800","width":"533","height":"800"}]
     * comments : [{"id":"98915","userid":"77237","avatar":"http://icon.xinliji.me//avatar_0_105.png","nickname":"兰朵","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"警察蜀黍，这里有人虐狗∪･ω･∪","createdDate":1481958011,"createdDateLabel":"2016/12/17"},{"id":"99006","userid":"122682","avatar":"http://image.xinliji.me/FsVnlJs3BcGsp0DQ_kmndWkVbD8x","nickname":"吖呆","isAnon":"0","isConsultant":"0","replyUserid":"77237","replyNickname":"兰朵","replyIsAnon":"0","replyIsConsultant":"","content":"哈哈😊","createdDate":1481987353,"createdDateLabel":"2016/12/17"},{"id":"99217","userid":"51773","avatar":"http://image.xinliji.me/FsVzB-yW_UJlZZiqvrOPKlIYUZZB","nickname":"乔瑞峰","isAnon":"0","isConsultant":"1","replyUserid":"77237","replyNickname":"兰朵","replyIsAnon":"0","replyIsConsultant":"","content":"虽然我是单身，也想有个人和我一起秀恩爱，晒晒照片。","createdDate":1482048705,"createdDateLabel":"2016/12/18"},{"id":"99266","userid":"120147","avatar":"http://image.xinliji.me/Fhf70BozOW1SS3To723sd1XTuqdI","nickname":"张瑞生","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"不明觉厉，也不想虐狗，我就是想在这里粗线一下","createdDate":1482055406,"createdDateLabel":"2016/12/18"},{"id":"99296","userid":"78228","avatar":"http://image.xinliji.me/FptOO05Xzs2FnF6pLN_97uQ0YKPf","nickname":"李丽霞","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"老年不宜。闪。","createdDate":1482067739,"createdDateLabel":"2016/12/18"},{"id":"99324","userid":"7287","avatar":"http://image.xinliji.me//FtrWfJM9GHm68-L-B-7cxv0E6O8u","nickname":"硬汉","isAnon":"0","isConsultant":"0","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"马上去找女朋友秀恩爱😊","createdDate":1482075009,"createdDateLabel":"2016/12/18"},{"id":"99341","userid":"108599","avatar":"http://image.xinliji.me/o_1atr3lspr1p831sibiiv9lqveki.jpg","nickname":"李兆汝","isAnon":"0","isConsultant":"1","replyUserid":"78228","replyNickname":"李丽霞","replyIsAnon":"0","replyIsConsultant":"1","content":"情侣可以一辈子😉","createdDate":1482108585,"createdDateLabel":"2016/12/19"},{"id":"99343","userid":"78228","avatar":"http://image.xinliji.me/FptOO05Xzs2FnF6pLN_97uQ0YKPf","nickname":"李丽霞","isAnon":"0","isConsultant":"1","replyUserid":"108599","replyNickname":"李兆汝","replyIsAnon":"0","replyIsConsultant":"1","content":"😜","createdDate":1482108742,"createdDateLabel":"2016/12/19"},{"id":"99392","userid":"122682","avatar":"http://image.xinliji.me/FsVnlJs3BcGsp0DQ_kmndWkVbD8x","nickname":"吖呆","isAnon":"0","isConsultant":"0","replyUserid":"78228","replyNickname":"李丽霞","replyIsAnon":"0","replyIsConsultant":"1","content":"老年也需要浪漫😁😁","createdDate":1482115885,"createdDateLabel":"2016/12/19"},{"id":"99399","userid":"78228","avatar":"http://image.xinliji.me/FptOO05Xzs2FnF6pLN_97uQ0YKPf","nickname":"李丽霞","isAnon":"0","isConsultant":"1","replyUserid":"122682","replyNickname":"吖呆","replyIsAnon":"0","replyIsConsultant":"","content":"😂","createdDate":1482116265,"createdDateLabel":"2016/12/19"},{"id":"99482","userid":"122682","avatar":"http://image.xinliji.me/FsVnlJs3BcGsp0DQ_kmndWkVbD8x","nickname":"吖呆","isAnon":"0","isConsultant":"0","replyUserid":"78228","replyNickname":"李丽霞","replyIsAnon":"0","replyIsConsultant":"1","content":"怎么啦😳😳😳","createdDate":1482142980,"createdDateLabel":"2016/12/19"},{"id":"99929","userid":"124599","avatar":"http://image.xinliji.me/FufmWq70lfXapcC067SogtIO28iA","nickname":"九天霹雳小次郎","isAnon":"0","isConsultant":"0","replyUserid":"7287","replyNickname":"硬汉","replyIsAnon":"0","replyIsConsultant":"","content":"快去快去","createdDate":1482284331,"createdDateLabel":"前天"},{"id":"100063","userid":"81483","avatar":"http://image.xinliji.me/Fh0blr_PRxL6vnDMuz7ncxdxD4JP","nickname":"俞红叶","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"默默围观一下","createdDate":1482315733,"createdDateLabel":"昨天"},{"id":"100095","userid":"102513","avatar":"http://image.xinliji.me/o_1ascib3k91uf4fq0h2e159gccsi.jpg","nickname":"张海燕","isAnon":"0","isConsultant":"1","replyUserid":"","replyNickname":"","replyIsAnon":"0","replyIsConsultant":"","content":"一定要放闪 不限性别 求同秀","createdDate":1482321508,"createdDateLabel":"昨天"},{"id":"100258","userid":"91305","avatar":"http://icon.xinliji.me/anon.png","nickname":"上海网友","isAnon":"1","isConsultant":"0","replyUserid":"77237","replyNickname":"兰朵","replyIsAnon":"0","replyIsConsultant":"","content":"生日快乐","createdDate":1482366104,"createdDateLabel":"昨天"}]
     * viewType : image
     */

    private List<ResultsBean> results;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorStr() {
        return errorStr;
    }

    public void setErrorStr(String errorStr) {
        this.errorStr = errorStr;
    }

    public String getResultCount() {
        return resultCount;
    }

    public void setResultCount(String resultCount) {
        this.resultCount = resultCount;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private String id;
        private String userid;
        private String nickname;
        private String avatar;
        private String isConsultant;
        private String canDel;
        private String isAnon;
        private String viewCnt;
        private String likeCnt;
        private String isLiked;
        private String commentCnt;
        private String location;
        private String content;
        private long createdDate;
        private String createdDateLabel;
        private String canShare;
        private String shareUrl;
        private String viewType;
        /**
         * url : http://image.xinliji.me/4ab98129-e468-4beb-a2e8-45d6b052cdaa?imageView2/0/w/800
         * width : 533
         * height : 800
         */

        private List<PhotosBean> photos;
        /**
         * id : 98915
         * userid : 77237
         * avatar : http://icon.xinliji.me//avatar_0_105.png
         * nickname : 兰朵
         * isAnon : 0
         * isConsultant : 0
         * replyUserid :
         * replyNickname :
         * replyIsAnon : 0
         * replyIsConsultant :
         * content : 警察蜀黍，这里有人虐狗∪･ω･∪
         * createdDate : 1481958011
         * createdDateLabel : 2016/12/17
         */

        private List<CommentsBean> comments;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getIsConsultant() {
            return isConsultant;
        }

        public void setIsConsultant(String isConsultant) {
            this.isConsultant = isConsultant;
        }

        public String getCanDel() {
            return canDel;
        }

        public void setCanDel(String canDel) {
            this.canDel = canDel;
        }

        public String getIsAnon() {
            return isAnon;
        }

        public void setIsAnon(String isAnon) {
            this.isAnon = isAnon;
        }

        public String getViewCnt() {
            return viewCnt;
        }

        public void setViewCnt(String viewCnt) {
            this.viewCnt = viewCnt;
        }

        public String getLikeCnt() {
            return likeCnt;
        }

        public void setLikeCnt(String likeCnt) {
            this.likeCnt = likeCnt;
        }

        public String getIsLiked() {
            return isLiked;
        }

        public void setIsLiked(String isLiked) {
            this.isLiked = isLiked;
        }

        public String getCommentCnt() {
            return commentCnt;
        }

        public void setCommentCnt(String commentCnt) {
            this.commentCnt = commentCnt;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public long getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(long createdDate) {
            this.createdDate = createdDate;
        }

        public String getCreatedDateLabel() {
            return createdDateLabel;
        }

        public void setCreatedDateLabel(String createdDateLabel) {
            this.createdDateLabel = createdDateLabel;
        }

        public String getCanShare() {
            return canShare;
        }

        public void setCanShare(String canShare) {
            this.canShare = canShare;
        }

        public String getShareUrl() {
            return shareUrl;
        }

        public void setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
        }

        public String getViewType() {
            return viewType;
        }

        public void setViewType(String viewType) {
            this.viewType = viewType;
        }

        public List<PhotosBean> getPhotos() {
            return photos;
        }

        public void setPhotos(List<PhotosBean> photos) {
            this.photos = photos;
        }

        public List<CommentsBean> getComments() {
            return comments;
        }

        public void setComments(List<CommentsBean> comments) {
            this.comments = comments;
        }

        public static class PhotosBean {
            private String url;
            private String width;
            private String height;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getWidth() {
                return width;
            }

            public void setWidth(String width) {
                this.width = width;
            }

            public String getHeight() {
                return height;
            }

            public void setHeight(String height) {
                this.height = height;
            }
        }

        public static class CommentsBean {
            private String id;
            private String userid;
            private String avatar;
            private String nickname;
            private String isAnon;
            private String isConsultant;
            private String replyUserid;
            private String replyNickname;
            private String replyIsAnon;
            private String replyIsConsultant;
            private String content;
            private long createdDate;
            private String createdDateLabel;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUserid() {
                return userid;
            }

            public void setUserid(String userid) {
                this.userid = userid;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getIsAnon() {
                return isAnon;
            }

            public void setIsAnon(String isAnon) {
                this.isAnon = isAnon;
            }

            public String getIsConsultant() {
                return isConsultant;
            }

            public void setIsConsultant(String isConsultant) {
                this.isConsultant = isConsultant;
            }

            public String getReplyUserid() {
                return replyUserid;
            }

            public void setReplyUserid(String replyUserid) {
                this.replyUserid = replyUserid;
            }

            public String getReplyNickname() {
                return replyNickname;
            }

            public void setReplyNickname(String replyNickname) {
                this.replyNickname = replyNickname;
            }

            public String getReplyIsAnon() {
                return replyIsAnon;
            }

            public void setReplyIsAnon(String replyIsAnon) {
                this.replyIsAnon = replyIsAnon;
            }

            public String getReplyIsConsultant() {
                return replyIsConsultant;
            }

            public void setReplyIsConsultant(String replyIsConsultant) {
                this.replyIsConsultant = replyIsConsultant;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public long getCreatedDate() {
                return createdDate;
            }

            public void setCreatedDate(long createdDate) {
                this.createdDate = createdDate;
            }

            public String getCreatedDateLabel() {
                return createdDateLabel;
            }

            public void setCreatedDateLabel(String createdDateLabel) {
                this.createdDateLabel = createdDateLabel;
            }
        }
    }
}
