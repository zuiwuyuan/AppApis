# AppApis
解析一些APP的API，如煎蛋APP，51妹子等，可以通过这些Api高仿一些API


通过UserAgent判断智能手机(设备,Android,IOS)
http://free0007.iteye.com/blog/2017329/

##煎蛋网

###煎蛋网-新鲜事列表
```
FreshNewsBean{title='内向的人为什么学习更快', detailUrl='http://i.jandan.net/2016/07/27/introverts-learn-faster.html', imgUrl='http://tankr.net/s/custom/QZDJ.jpg', keyWords='熊猫丹 / 心理学'}
FreshNewsBean{title='饭来张口：智能喂食机器人', detailUrl='http://i.jandan.net/2016/07/27/obi-robot.html', imgUrl='http://tankr.net/s/custom/FAEI.jpg', keyWords='熊猫丹 / 人工智能'}
FreshNewsBean{title='如何应对儿童噩梦与夜惊', detailUrl='http://i.jandan.net/2016/07/27/nightmares-night-terrors.html', imgUrl='http://tankr.net/s/custom/ISTT.jpg', keyWords='新江湖一点黑 / 走进科学'}
FreshNewsBean{title='煎蛋小学堂：我们该寻找和接触外星人吗？', detailUrl='http://i.jandan.net/2016/07/27/extraterrestrial-life-2.html', imgUrl='http://tankr.net/s/custom/RV2U.jpg', keyWords='小脑袋 / 小学堂'}
FreshNewsBean{title='萨摩亚人：我胖，我忍耐，我征服', detailUrl='http://i.jandan.net/2016/07/27/powerful-obesity-gene.html', imgUrl='http://tankr.net/s/custom/VHAA.jpg', keyWords='肌肉桃 / 走进科学'}
FreshNewsBean{title='乌鸦，鸟界的福尔摩斯', detailUrl='http://i.jandan.net/2016/07/27/crows-investigate.html', imgUrl='http://tankr.net/s/custom/AMU3.jpg', keyWords='肌肉桃 / 走进科学'}
FreshNewsBean{title='不应被遗忘的壮举：“阳光动力”2号环球飞行', detailUrl='http://i.jandan.net/2016/07/27/solar-impulse-2-2.html', imgUrl='http://tankr.net/s/custom/T3MX.jpg', keyWords='小鱼儿 / 高科技'}
FreshNewsBean{title='留意屎尿颜色，可知有疾无疾', detailUrl='http://i.jandan.net/2016/07/27/pee-poo-color.html', imgUrl='http://tankr.net/s/custom/XMCH.jpg', keyWords='新江湖一点黑 / 健康'}
FreshNewsBean{title='UKNOWHAT：蜘蛛是没有屌的', detailUrl='http://i.jandan.net/2016/07/27/you-know-what.html', imgUrl='http://tankr.net/s/custom/XQ2C.jpg', keyWords='金星 / 冷新闻'}
FreshNewsBean{title='斯诺登设计了一款「反监视」手机壳', detailUrl='http://i.jandan.net/2016/07/27/phone-case.html', imgUrl='http://tankr.net/s/custom/G064.jpg', keyWords='许叔 / 数码产品'}
FreshNewsBean{title='韩国士兵减压新方式——跳芭蕾', detailUrl='http://i.jandan.net/2016/07/27/soldiers-take-ballet.html', imgUrl='http://tankr.net/s/custom/ZUE6.jpg', keyWords='island / 冷新闻'}
FreshNewsBean{title='避孕套放哪儿好', detailUrl='http://i.jandan.net/2016/07/27/never-mind.html', imgUrl='http://tankr.net/s/custom/3ATP.jpg', keyWords='Macondo / SEX'}
FreshNewsBean{title='7种值得一试的啪啪啪姿势[NSFW]', detailUrl='http://i.jandan.net/2016/07/27/useless-knowledge.html', imgUrl='http://tankr.net/s/custom/GB7Y.jpg', keyWords='Rare / SEX'}
FreshNewsBean{title='美国法官：比特币不是钱，怎么用咱不管', detailUrl='http://i.jandan.net/2016/07/27/bitcoin-not-money.html', imgUrl='http://tankr.net/s/custom/V0U1.jpg', keyWords='肌肉桃 / Tech'}
FreshNewsBean{title='Luca：这货就是所有地球生命的祖先？', detailUrl='http://i.jandan.net/2016/07/27/luca-photo.html', imgUrl='http://tankr.net/s/custom/7ZZ5.jpg', keyWords='许叔 / 走进科学'}
FreshNewsBean{title='无聊图大吐槽【40P】', detailUrl='http://i.jandan.net/2016/07/27/hahaha-8-4.html', imgUrl='http://tankr.net/s/custom/MULD.jpg', keyWords='金星 / 大吐槽'}

```

###煎蛋网-新鲜事详情
```
FreshNewsDetail{type=1, desc='null', imgSmall='//tankr.net/s/small/4E6U.jpg', imgMedium='//tankr.net/s/medium/4E6U.jpg'}
FreshNewsDetail{type=2, desc='机器人工程师们开始越来越多地从自然中获取设计灵感，比如蟑螂，鳗鱼，蝾螈，蜘蛛和黄貂鱼。', imgSmall='null', imgMedium='null'}
FreshNewsDetail{type=2, desc='哈佛大学的科学家们把目光转向可地球上最聪明的生物之一，章鱼，并将其独特的能力转化到机器人设计上。', imgSmall='null', imgMedium='null'}
FreshNewsDetail{type=2, desc='这个自供电，有八只手臂的装置是一个完全柔软的机器人。设计者说这一特征可以让它比其他刚性材料更加适应自然环境。', imgSmall='null', imgMedium='null'}
FreshNewsDetail{type=1, desc='null', imgSmall='//tankr.net/s/small/3SBU.jpg', imgMedium='//tankr.net/s/medium/3SBU.jpg'}
FreshNewsDetail{type=2, desc='「机械章鱼」由体内的化学燃料提供电力，一种过氧化氢水溶液。当它穿过含有铂基催化剂的反应室时，化学燃料就会分解，产生增压氧气，然后用作伸展章鱼手臂里的充气隔室，从而可以移动。', imgSmall='null', imgMedium='null'}
FreshNewsDetail{type=2, desc='[link]', imgSmall='null', imgMedium='null'}
FreshNewsDetail{type=2, desc='“控制系统大约分成四部分：上游(液体燃料储存)，振荡器(液体燃料调节)，反应室(分解为增压气体)和下游(气体驱动与通气分配)，”论文中解释到。', imgSmall='null', imgMedium='null'}
FreshNewsDetail{type=2, desc='组建机器人用到了一系列技术，包括了3D打印气动网络。', imgSmall='null', imgMedium='null'}
FreshNewsDetail{type=2, desc='过去，软体机器人一直受到局限，因为必须装上坚硬的电池。自带液体燃料的能力则打破了这一限制。', imgSmall='null', imgMedium='null'}
FreshNewsDetail{type=2, desc='研究作者，哈佛大学保尔森工程与应用科学学院博士生Ryan Truby谈到了这项技术的应用前景：', imgSmall='null', imgMedium='null'}
FreshNewsDetail{type=2, desc='“软体机器人还处在萌芽时期。这一系统的的前景令人兴奋，尤其是人机接口方面，比如可穿戴和生物医学技术。因为这些机器人系统是建立在诸如硅胶之类的软体材料上，它们比传统机器人更安全，而且也更加适合这方面的应用。此外，软体机器人也可以使用在传统机器人无法应用的环境里，比如水下作业。”', imgSmall='null', imgMedium='null'}
FreshNewsDetail{type=1, desc='null', imgSmall='//tankr.net/s/small/I4QA9NC7.jpg', imgMedium='//tankr.net/s/medium/I4QA9NC7.jpg'}
FreshNewsDetail{type=2, desc='Jennifer Lewis和她同事们的研究已经发表在《自然》上，其中写道「机械章鱼」目前可以运行4到8分钟，但是这个运行时间会随着设计和部件制造的改进变得更加持久。', imgSmall='null', imgMedium='null'}
FreshNewsDetail{type=2, desc='“我们的综合设计和快速加工方法是我们可以在该架构里对不同材料进行可编程组装，从而为完全柔软的自主式机器人打下了基础，”研究者写到。', imgSmall='null', imgMedium='null'}
FreshNewsDetail{type=2, desc='[许叔 via cosmosmagazine]', imgSmall='null', imgMedium='null'}

```


###煎蛋网-段子列表
```
DuanziBean{author='ayaoayaoaya', lastUpdateTime='59 mins ago', content='天上的星星不说话，地上的三星会爆炸。手上的Note7炸呀炸，辛苦的钱啊都白花。啊～啊啊～啊～啊啊啊啊～夜夜想起库克的话，三星的Note7会爆炸……'}
DuanziBean{author='光消失的地方', lastUpdateTime='2 hours ago', content='Windows系统有两个骗局，一个是接上新硬件时通过Windows
Update查找驱动，从来没有成功过；另一个是进入不了系统时，系统会进入recovery，妄图进行自身修复，也从来没成功过。'}
DuanziBean{author='朕是皇阿玛', lastUpdateTime='3 hours ago', content='好人不长命，因为天堂也缺好人。'}
DuanziBean{author='jimmyf1984', lastUpdateTime='3 hours ago', content='近期把妹名句：「要不要来我家抓神奇宝贝。」
真是一语双关又带有情色与娱乐意味。
——Twitter.
ryo6.'}
DuanziBean{author='Utopia', lastUpdateTime='3 hours ago', content='“只要我努力就能找到女朋友吗？”
“对啊，只要你努力就能找到像你一样差的女朋友。”'}
DuanziBean{author='天才', lastUpdateTime='3 hours ago', content='【光消失的地方】是不是跟煎蛋签约了？？？'}
DuanziBean{author='Onenicex', lastUpdateTime='4 hours ago', content='“我x，你们背着我有群了。”'}
DuanziBean{author='liweim', lastUpdateTime='4 hours ago', content='每次听到“只睡五个小时地辛苦创业…”时，我就特别想问，你拉了多少人入坑，他们又都在哪？'}
DuanziBean{author='Jack酱', lastUpdateTime='4 hours ago', content='2016小小说：《来》
夜黑风高，荒山野岭。小木屋里。
男：“来了？”
女：“来了。”
男:“没来吧？”
女:“没来。”
男：“来？”
女：“来。”
男：“来了没？‘’
女：“还没来。”
男：“还没来？”
女：“来了。”
女：“还来不？”
男：“不来了，来不了了。”'}
DuanziBean{author='HolyC', lastUpdateTime='4 hours ago', content='腰疼谁给我揉揉
说:
女生削铅笔时不小用把手划出个口子，喜欢她的男生见状，立即拿过女生手中的铅笔刀，把自己的手也割出一道口子。
女生问他：“你这是做什么?”
男生深情凝视女生说：“你看，这样一来我们就是两口子了。”
半个月后，男孩因为染上破伤风杆菌死了。'}
DuanziBean{author='Zzz', lastUpdateTime='5 hours ago', content='昨天刷微博，看到一个比较红的博主发了两张超载鸡，评论里面居然很少知道那是什么，很多人在问哪里有卖？蛋友还真是比想象中的少'}
DuanziBean{author='老和', lastUpdateTime='5 hours ago', content='饿得睡不着，数羊。一只，两只……32串，33串……'}

```

###煎蛋网-妹子图列表
```
MeizhiBean{author='小宝', lastUpdateTime='4 hours ago', imgs=[http://ww1.sinaimg.cn/large/66b3de17gw1f7wva5yw4aj20m80xcn52.jpg]}
MeizhiBean{author='小宝', lastUpdateTime='4 hours ago', imgs=[http://ww3.sinaimg.cn/large/66b3de17gw1f7wva555hjj20np0zkdja.jpg]}
MeizhiBean{author='小宝', lastUpdateTime='4 hours ago', imgs=[http://ww2.sinaimg.cn/large/66b3de17gw1f7wva4szsfj20r213ktj4.jpg]}
MeizhiBean{author='小宝', lastUpdateTime='4 hours ago', imgs=[http://ww2.sinaimg.cn/large/66b3de17gw1f7wva33h14j20g40lgtak.jpg]}
MeizhiBean{author='小宝', lastUpdateTime='4 hours ago', imgs=[http://ww4.sinaimg.cn/large/66b3de17gw1f7wva2ool5j20k00u0jtf.jpg]}
MeizhiBean{author='小宝', lastUpdateTime='4 hours ago', imgs=[http://ww3.sinaimg.cn/large/66b3de17gw1f7wva2b4dwj20ld0sgn0k.jpg]}

```


###煎蛋网-无聊图列表
```
QutuBean{author='食品级怪蜀黍', lastUpdateTime='34 mins ago', imgs=[http://ww2.sinaimg.cn/large/537d92b0jw1f8831xcph0j20jg0dt402.jpg]}

```

##句子迷

###句子迷-名人名句-电影台词列表
```
SentenceSimple{title='《暮光之城：月食》', content='1. 我立马就会回来的。照管好我的心，我已经把它交给了你。 2. 我会在你还来不及想我的时候就会来的， 看好我的心——我把它留在你身边了。 ...', imgUrl='http://file.juzimi.com/category_pictures/201401/muguangzhicheng_yueshijingdianyulu29001.jpg', detailUrl='http://www.juzimi.com/article/29001', source_num='《暮光之城：月食》台词 (8)'}
SentenceSimple{title='《家园防线》', content='1. 无论你在想什么，再想想。 ...', imgUrl='http://file.juzimi.com/category_pictures/201406/jiayuanfangxianjingdianyulu47920.jpg', detailUrl='http://www.juzimi.com/article/47920', source_num='《家园防线》台词 (1)'}
SentenceSimple{title='《变形金刚4》', content='1. 不知道为什么有些人总是会让人为他而牺牲生命？也许这就是领袖的魅力。擎天柱的魅力！ 2. 你们要像他们保护你们一样保护他们！ ...', imgUrl='http://file.juzimi.com/category_pictures/201406/bianxingjingang4jingdianyulu53483.jpg', detailUrl='http://www.juzimi.com/article/53483', source_num='《变形金刚4》台词 (26)'}
SentenceSimple{title='《年少轻狂》', content='1. 大学四年里面，就算最后一天都没有爱情也没关系。 2. 只有爱人才会留住美的永恒。 ...', imgUrl='http://file.juzimi.com/category_pictures/201504/nianshaoqingkuangjingdianyulu54421.jpg', detailUrl='http://www.juzimi.com/article/54421', source_num='《年少轻狂》台词 (9)'}
SentenceSimple{title='《宋家皇朝》', content='1. 时代的进步必付出行动的勇气而不是瞻前顾，只允许接受，不许批评是中古精神而不是现代准则。 2. 也许在任何革命中死得最多的是男人，但受伤最深...', imgUrl='http://file.juzimi.com/category_pictures/201511/songjiahuangchaojingdianyulu244025.jpg', detailUrl='http://www.juzimi.com/article/244025', source_num='《宋家皇朝》台词 (2)'}
SentenceSimple{title='《谁说我们不会爱》', content='1. 今夜，所有的人都是最真实的。 2. 在天台那晚上，你们到底有没有？ ...', imgUrl='http://file.juzimi.com/category_pictures/201401/shuishuowomenbuhuiaijingdianyulu29668.jpg', detailUrl='http://www.juzimi.com/article/29668', source_num='《谁说我们不会爱》台词 (17)'}
SentenceSimple{title='《王尔德》', content='1. 世界在我掌握中，我却掌握不住对你的感情。 2. 为什么幸福竟依赖这么细小的东西 ...', imgUrl='http://file.juzimi.com/category_pictures/201312/wangerdejingdianyulu26927.jpg', detailUrl='http://www.juzimi.com/article/26927', source_num='《王尔德》台词 (4)'}
SentenceSimple{title='《伊豆的舞女》', content='1. 当我拥有你，无论是在百货公司买领带，还是在厨房收拾一尾鱼，我都觉得幸福。爱像一股暖流滋润着我。当我失去你，即便面对鸟语花香我也兴味索然。一切显...', imgUrl='http://file.juzimi.com/category_pictures/201312/yidoudewunvjingdianyulu9607.jpg', detailUrl='http://www.juzimi.com/article/%E4%BC%8A%E8%B1%86%E7%9A%84%E8%88%9E%E5%A5%B3', source_num='《伊豆的舞女》台词 (20)'}
SentenceSimple{title='《黄金时代》', content='1. 我不能选择怎么生，怎么死，但我能决定怎么爱，怎么活。这是我要的自由，我的黄金时代。 2. 钞票带在我的衣袋里，就这样，两个人理直气壮地走在...', imgUrl='http://file.juzimi.com/category_pictures/201409/huangjinshidaijingdianyulu75067.jpg', detailUrl='http://www.juzimi.com/article/75067', source_num='《黄金时代》台词 (21)'}
SentenceSimple{title='《分手不分手》', content='1. 女人不伤心是因为她不走心，不嫉妒也就是不爱。 2. 嫁给你这么不负责人的男人，我就要吃一辈子苦。 ...', imgUrl='http://file.juzimi.com/category_pictures/201505/fenshoubufenshoujingdianyulu158931.jpg', detailUrl='http://www.juzimi.com/article/158931', source_num='《分手不分手》台词 (8)'}
SentenceSimple{title='《记忆裂痕》', content='1. 人生就是经历累积而成，况且，有些快乐的事完全是错误的。 2. 如果你只看逃不了的地方，就会错失底下的财富。 ...', imgUrl='http://file.juzimi.com/category_pictures/201410/jiyiliehenjingdianyulu81480.jpg', detailUrl='http://www.juzimi.com/article/81480', source_num='《记忆裂痕》台词 (6)'}
SentenceSimple{title='《海扁王2》', content='1. Try to have fun. Otherwise, what's the point? 尽量过得开心点。不然的话，有什么意思？ ...', imgUrl='http://file.juzimi.com/category_pictures/201503/haibianwang2jingdianyulu137761.jpg', detailUrl='http://www.juzimi.com/article/137761', source_num='《海扁王2》台词 (1)'}
SentenceSimple{title='《不朽的园丁》', content='1. 你叫我回家，可是你要知道你才是我的家 ...', imgUrl='http://file.juzimi.com/category_pictures/201401/buxiudeyuandingjingdianyulu28827.jpg', detailUrl='http://www.juzimi.com/article/28827', source_num='《不朽的园丁》台词 (1)'}
SentenceSimple{title='《危险关系》', content='1. 认真了，你就输了 2. 我心里一直有一个女人，她不是你... ...', imgUrl='http://file.juzimi.com/category_pictures/201407/weixianguanxijingdianyulu26233.jpg', detailUrl='http://www.juzimi.com/article/26233', source_num='《危险关系》台词 (6)'}
SentenceSimple{title='《哈利·波特与火焰杯》', content='1. If you want to know what a man's like, take a good look at how he treat...', imgUrl='http://file.juzimi.com/category_pictures/201502/haliboteyuhuoyanbeijingdianyulu117307.jpg', detailUrl='http://www.juzimi.com/article/117307', source_num='《哈利·波特与火焰杯》台词 (3)'}
SentenceSimple{title='《洛奇》', content='1. 让我告诉你一件事，如果没有你，今天我可能不会活着，你在这里及所有的表现给了我，你称它为什么？活下去的动机？因为我认为人们不想活下去，就会死亡，...', imgUrl='http://file.juzimi.com/category_pictures/201312/luoqijingdianyulu28175.jpg', detailUrl='http://www.juzimi.com/article/28175', source_num='《洛奇》台词 (4)'}
SentenceSimple{title='《冠军》', content='1. “人生就是不放弃坚持到底!” —献给那些为理想努力着的人们 2. We are the compion,就算不能征服全世界，也要拥有自己...', imgUrl='http://file.juzimi.com/category_pictures/201312/guanjunjingdianyulu28093.jpg', detailUrl='http://www.juzimi.com/article/28093', source_num='《冠军》台词 (2)'}
SentenceSimple{title='《我们需要谈谈凯文》', content='1. 妈妈，我是你的投影，是你的恶，是你不为人知不愿承认的。 ...', imgUrl='http://file.juzimi.com/category_pictures/201311/womenxuyaotantankaiwenjingdianyulu25951.jpg', detailUrl='http://www.juzimi.com/article/25951', source_num='《我们需要谈谈凯文》台词 (1)'}
SentenceSimple{title='《伤城》', content='1. 寂寞是听见某个熟悉名字，不小心想起某些故事；孤独是路过我身边的影子，笑着对我说似曾相识。 2. 年轻的时候我们都想着要去改变这个世界，到头...', imgUrl='http://file.juzimi.com/category_pictures/201310/shangchengjingdianyulu6565.jpg', detailUrl='http://www.juzimi.com/article/%E4%BC%A4%E5%9F%8E', source_num='《伤城》台词 (17)'}
SentenceSimple{title='《黑客帝国》', content='1. 所谓选择，都是虚幻。 2. We are not here because we are free .we are here becaus...', imgUrl='http://file.juzimi.com/category_pictures/201312/heikediguojingdianyulu8456.jpg', detailUrl='http://www.juzimi.com/article/%E9%BB%91%E5%AE%A2%E5%B8%9D%E5%9B%BD', source_num='《黑客帝国》台词 (13)'}

```

###句子迷-原创句子
```
SentenceDetail{content='这里终究不是我的归处 总有一天还是会选择离开 只是下一次又能逃到哪里 可以不悲伤 可以不迷惘'}
SentenceDetail{content='我的人生如一张白纸，你们从上面走过，上面变有了足迹。'}
SentenceDetail{content='其实心里有个忘不掉的人，总在无聊时想想，忙时也想想，吃饭时想想，听歌时想想，晨运时想想。'}
SentenceDetail{content='我总是会在人群中左右的思考着，为什么我会出现在这里？接下来我该干些什么？我又该去哪，回哪去？'}
SentenceDetail{content='2016.9.27 如此英气的一张脸 如此英俊的容颜 如此遗憾 如划破天际的流星 如转瞬即逝的樱花 如顺水飘零的落英 如随风起舞的落叶 如一阵风。 去到该去的地方。 从此。 花未眠。 但见花痕 从此 翩翩不在 莞尔不复'}
SentenceDetail{content='那段时间你就是我的朋友圈。'}
SentenceDetail{content='其实我，不怕晚，不怕等，不怕你走。 只怕忘不了你。'}
SentenceDetail{content='想你的思念 文/戚瑞 这雨夜，惆怅整晚的夜色 打湿我这个雨季最脆弱的心 这枯黄了记忆的叶落了整夜 如果我不说你不知 想你的思念总会好的 这雨夜，惆怅整晚的夜色 打湿我这个雨季最脆弱的心 这思念了记忆的秋愁了整夜 如果我不说你不知 想你的思念总会好的'}
SentenceDetail{content='告诉自己 醒醒吧，别再傻了。 结果醒了，还是傻的。'}
SentenceDetail{content='若没有放弃一切的勇气，又怎么值得去拥有一切。'}

```

###句子迷-精选句集
```
SentenceCollection{title='人生哲学', desc='睿智是最高目标，思想主导一切。', imgUrl='http://file.juzimi.com/avatar_selection/avatar0035.jpg', detailUrl='http://www.juzimi.com//album/39826', username='冰心兰玉', count='136'}
SentenceCollection{title='盗墓笔记·同人', desc='', imgUrl='http://file.juzimi.com/pictures/201508/picture-275923_2021825316.jpg', detailUrl='http://www.juzimi.com//album/1077096', username='听书人却入戏深', count='313'}
SentenceCollection{title='古风美文句子', desc='', imgUrl='http://file.juzimi.com/pictures/201604/picture-245749_2060282853.jpg', detailUrl='http://www.juzimi.com//album/789347', username='离惊浅', count='553'}
SentenceCollection{title='话剧经典台词', desc='孟京辉、廖一梅、赖声川等的戏剧经典台词精选', imgUrl='http://file.juzimi.com/pictures/201305/picture-67_1709089899.jpg', detailUrl='http://www.juzimi.com//album/109977', username='丽儿', count='33'}
SentenceCollection{title='此去经年', desc='此去经年，应是良辰好景虚设。 便纵有千种风情，更与何人说？', imgUrl='http://file.juzimi.com/pictures/201403/picture-54786_950300402.jpg', detailUrl='http://www.juzimi.com//album/255428', username='迷宫', count='122'}
SentenceCollection{title='唯美语录', desc='', imgUrl='http://file.juzimi.com/avatar_selection/avatar0017.jpg', detailUrl='http://www.juzimi.com//album/342498', username='丝丝青梦', count='256'}
SentenceCollection{title='电影经典台词', desc='本句集精选众多最受欢迎的电影经典台词，让我们一起回味那些经典。', imgUrl='http://file.juzimi.com/pictures/201408/picture-118798_470461133.jpg', detailUrl='http://www.juzimi.com//album/433231', username='巴茨贝巴', count='230'}
SentenceCollection{title='作文素材', desc='', imgUrl='http://file.juzimi.com/pictures/201608/picture-442810_1694766685.jpg', detailUrl='http://www.juzimi.com//album/1199750', username='取蓝', count='98'}
SentenceCollection{title='高晓松体', desc='很有意思的各个行业版本。起源于高晓松挺舒淇的微博，太欢乐啦。', imgUrl='http://file.juzimi.com/pictures/picture-411820500714.jpg', detailUrl='http://www.juzimi.com//album/19199', username='梦想', count='20'}
SentenceCollection{title='古风原创句集', desc='', imgUrl='http://file.juzimi.com/pictures/201507/picture-164698_1316252983.jpg', detailUrl='http://www.juzimi.com//album/554459', username='♛琼华烟珞℡', count='138'}
SentenceCollection{title='人生感悟', desc='当我们懂得幸福的时候，是因为我们懂得了珍惜。 你再怎么改变也不能让每个人都喜欢你，所以还不如做一个自己想做的人。 人生都太短暂，去疯去爱去浪费，去追去梦去后悔。 总有让我们悲伤......', imgUrl='http://file.juzimi.com/avatar_selection/avatar0042.jpg', detailUrl='http://www.juzimi.com//album/87869', username='。_7', count='96'}
SentenceCollection{title='世界上最悲伤的句子', desc='这些句子，记录着我的哀伤 在那些难过的日子里，与我为伴', imgUrl='http://file.juzimi.com/pictures/picture-7222578.jpg', detailUrl='http://www.juzimi.com//album/427', username='扬小小', count='22'}

```

###句子迷-图文美句
```
SentenceImageText{text='在这场友情的游戏里，最终我们选择彼此伤害，你让我百孔千疮，而我则让你落花成伤。', desc='在这场友情的游戏里，最终我们选择彼此伤害，你让我百孔千疮，而我则让你落花成伤。', url='http://www.juzimi.com/ju/59088', pic='http://file.juzimi.com/weibopic/jazlma4.jpg'}
SentenceImageText{text='宇宙之大，每个生命，都在孤寂。 ——@许嵩 《宇宙之大》', desc='宇宙之大，每个生命，都在孤寂。 ——许嵩 《宇宙之大》', url='http://www.juzimi.com/ju/472340', pic='http://file.juzimi.com/weibopic/juzomo3.jpg'}
SentenceImageText{text='曾经有个人 爱我如生命 ——@舒仪 《曾有一个人，爱我如生命》', desc='曾经有个人 爱我如生命 ——舒仪 《曾有一个人，爱我如生命》', url='http://www.juzimi.com/ju/82987', pic='http://file.juzimi.com/weibopic/jdzema6.jpg'}
SentenceImageText{text='选一种姿态，让自己活得无可替代。', desc='选一种姿态，让自己活得无可替代。', url='http://www.juzimi.com/ju/45924', pic='http://file.juzimi.com/weibopic/jizimd1.jpg'}
SentenceImageText{text='有那么一个人的存在，他让你觉得自己应该要变得更好。可能他是你身边的人，也可能他不是，可能他离你很近，也可能离你很远。因为你想要变成他那样的人，你想要努力，变得温柔，变得倔强。因为努力了，所以慢慢的，我们变成自己喜欢的样子。愿我们都能找到这个人，尽管也许那个人一辈子都不可能知道你。 ——@卢思浩', desc='有那么一个人的存在，他让你觉得自己应该要变得更好。可能他是你身边的人，也可能他不是，可能他离你很近，也可能离你很远。因为你想要变成他那样的人，你想要努力，变得温柔，变得倔强。因为努力了，所以慢慢的，我们变成自己喜欢的样子。愿我们都能找到这个人，尽管也许那个人一辈子都不可能知道你。 ——卢思浩', url='http://www.juzimi.com/ju/247923', pic='http://file.juzimi.com/weibopic/jlzrma1.jpg'}
SentenceImageText{text='这些人都随着我的长大没有了影子了。是跟着我失去的童年一起失去了吗？ ——@林海音 《城南旧事》', desc='这些人都随着我的长大没有了影子了。是跟着我失去的童年一起失去了吗？ ——林海音 《城南旧事》', url='http://www.juzimi.com/ju/534679', pic='http://file.juzimi.com/weibopic/jlzrmu1.jpg'}
SentenceImageText{text='我对你根本没抱幻想。我知道你愚蠢，轻佻，头脑空虚，然而我爱你。我知道你的企图、你的理想，你的势利，庸俗，然而我爱你。我知道你是个二流货色，然而我爱你。 ——毛姆 《面纱》', desc='我对你根本没抱幻想。我知道你愚蠢，轻佻，头脑空虚，然而我爱你。我知道你的企图、你的理想，你的势利，庸俗，然而我爱你。我知道你是个二流货色，然而我爱你。 ——毛姆 《面纱》', url='http://www.juzimi.com/ju/459565', pic='http://file.juzimi.com/weibopic/jxzdmp.jpg'}
SentenceImageText{text='“那么，结局如何？学长他知道吗？”   “他知道，但结局有点悲伤。 因为我成绩优异，所以去了美国念高中，跟在美国的爸爸住在一起。”  “那的确很悲伤。” “但是我想过了，学长他就像我生命中的灵感，他让我了解爱的积极意义，他就像是让我一直前进的动力，让我有了今天的成绩。” 《初恋这件小事》', desc='“那么，结局如何？学长他知道吗？”   “他知道，但结局有点悲伤。 因为我成绩优异，所以去了美国念高中，跟在美国的爸爸住在一起。”  “那的确很悲伤。” “但是我想过了，学长他就像我生命中的灵感，他让我了解爱的积极意义，他就像是让我一直前进的动力，让我有了今天的成绩。” 《初恋这件小事》', url='http://www.juzimi.com/ju/120325', pic='http://file.juzimi.com/weibopic/jlzlmr.jpg'}
SentenceImageText{text='非让现实给你一巴掌，你才知道现实有多残忍。 ——@顾里 《小时代》', desc='非让现实给你一巴掌，你才知道现实有多残忍。 ——顾里 《小时代》', url='http://www.juzimi.com/ju/410673', pic='http://file.juzimi.com/weibopic/jdzxmp2.jpg'}
SentenceImageText{text='骨头，我来接你回家了。 ——@fresh果果 《花千骨》', desc='骨头，我来接你回家了。 ——fresh果果 《花千骨》', url='http://www.juzimi.com/ju/634050', pic='http://file.juzimi.com/weibopic/jezdmp4.jpg'}
SentenceImageText{text='真正的力量绝对不是依靠这点东西激发出来的，希灵使徒应掌握更长久更伟大的力量……我们不是一帮被仇恨驱使的疯子，我们应该是为了荣耀和秩序死战不休的战士。即便我们摧毁了一切敌人，甚至摧毁深渊。我们也必须有继续前进下去的理由才行，就像先祖们决定跨过临界层的时候一样，不断前进，没有理由也没有鞭策。前进就是一切，这才是希灵意志！ ——珊多拉 《希灵帝国》', desc='真正的力量绝对不是依靠这点东西激发出来的，希灵使徒应掌握更长久更伟大的力量……我们不是一帮被仇恨驱使的疯子，我们应该是为了荣耀和秩序死战不休的战士。即便我们摧毁了一切敌人，甚至摧毁深渊。我们也必须有继续前进下去的理由才行，就像先祖们决定跨过临界层的时候一样，不断前进，没有理由也没有鞭策。前进就是一切，这才是希灵意志！ ——珊多拉 《希灵帝国》', url='http://www.juzimi.com/ju/590321', pic='http://file.juzimi.com/weibopic/juzamu4.jpg'}
SentenceImageText{text='谁见过风呢 我和你也没见过 但当树叶颤动 就知风吹过 ——宫崎骏 《起风了》', desc='谁见过风呢 我和你也没见过 但当树叶颤动 就知风吹过 ——宫崎骏 《起风了》', url='http://www.juzimi.com/ju/1552425', pic='http://file.juzimi.com/weibopic/jezxmi7.jpg'}
SentenceImageText{text='用一首歌的旋律， 回忆某个曾经。  用一首歌的旋律， 倾诉一段光阴。  用一首歌的旋律， 忘掉所有道理。  用一首歌的旋律， 感激过去敬启。  用一首歌的旋律， 把爱恨都看分明。  用一首歌的旋律， 擦掉悲伤的泪滴。  用一首歌的旋律， 祈祷爱情会降临。  用一首歌的旋律， 改变明天和自己。', desc='用一首歌的旋律， 回忆某个曾经。  用一首歌的旋律， 倾诉一段光阴。  用一首歌的旋律， 忘掉所有道理。  用一首歌的旋律， 感激过去敬启。  用一首歌的旋律， 把爱恨都看分明。  用一首歌的旋律， 擦掉悲伤的泪滴。  用一首歌的旋律， 祈祷爱情会降临。  用一首歌的旋律， 改变明天和自己。', url='http://www.juzimi.com/ju/804502', pic='http://file.juzimi.com/weibopic/jrzamp5.jpg'}
SentenceImageText{text='我曾经默默无语地，毫无指望地爱过你。 ——普希金 《我曾经爱过你》', desc='我曾经默默无语地，毫无指望地爱过你。 ——普希金 《我曾经爱过你》', url='http://www.juzimi.com/ju/609566', pic='http://file.juzimi.com/weibopic/jlzrmp4.jpg'}
SentenceImageText{text='切忌太美丽，太美丽有罪，快乐太易碎。 ——@黄伟文 《美丽有罪》', desc='切忌太美丽，太美丽有罪，快乐太易碎。 ——黄伟文 《美丽有罪》', url='http://www.juzimi.com/ju/16680', pic='http://file.juzimi.com/weibopic/jizimi3.jpg'}
SentenceImageText{text='从这个世界上消失，一个DNA都不要留下，顺便抹去别人对你的记忆。 《银魂》', desc='从这个世界上消失，一个DNA都不要留下，顺便抹去别人对你的记忆。 《银魂》', url='http://www.juzimi.com/ju/132666', pic='http://file.juzimi.com/weibopic/jizxmr4.jpg'}
SentenceImageText{text='黑暗无边 与你并肩 ——@郭敬明 《小时代》', desc='黑暗无边 与你并肩 ——郭敬明 《小时代》', url='http://www.juzimi.com/ju/189412', pic='http://file.juzimi.com/weibopic/jozrmi6.jpg'}
SentenceImageText{text='“以前答应了一个人，等她等到三十岁，结果三十岁一过，可以结婚，却单身单习惯了。” ——@唐七公子 《岁月是朵两生花》', desc='“以前答应了一个人，等她等到三十岁，结果三十岁一过，可以结婚，却单身单习惯了。” ——唐七公子 《岁月是朵两生花》', url='http://www.juzimi.com/ju/172645', pic='http://file.juzimi.com/weibopic/jpzrmx4.jpg'}
SentenceImageText{text='好像有什么美好的东西，正逐渐从我生命中剥离，残忍的清晰的近乎窒息的痛苦，绝望的挽留却毫无用处。', desc='好像有什么美好的东西，正逐渐从我生命中剥离，残忍的清晰的近乎窒息的痛苦，绝望的挽留却毫无用处。', url='http://www.juzimi.com/ju/889122', pic='http://file.juzimi.com/weibopic/jizamu5.jpg'}
SentenceImageText{text='遗忘有一把竖琴，记忆用它弹奏无声的忧伤。 你的童年是小村庄，可是，你走不出它的边际，无论你远行到何方。 ——@阿多尼斯 《我的孤独是一座花园》', desc='遗忘有一把竖琴，记忆用它弹奏无声的忧伤。 你的童年是小村庄，可是，你走不出它的边际，无论你远行到何方。 ——阿多尼斯 《我的孤独是一座花园》', url='http://www.juzimi.com/ju/403093', pic='http://file.juzimi.com/weibopic/jdzemo3.jpg'}
SentenceImageText{text='众里嫣然通一顾,人间颜色如尘土。 ——@王国维 《人间词》', desc='众里嫣然通一顾,人间颜色如尘土。 ——王国维 《人间词》', url='http://www.juzimi.com/ju/672157', pic='http://file.juzimi.com/weibopic/jpzpml7.jpg'}

```

##51妹子

###51妹子-最新-妹子列表
```
JokeBean{userName='有创意的美容广告', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[碉堡, 亮了, 惊呆, 城会玩], dataBean=DataBean{content='null', showImg='http://image4.pengfu.cn/origin/160927/57e9b9c5b3e54.jpg', gifsrcImg='', width='490', height='601'}}
JokeBean{userName='熊猫夫妇亲热被偷窥狂打断', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/358/2041358.jpg', tags=[动态图, 亮了, 新纪元, 吐槽], dataBean=DataBean{content='null', showImg='http://image3.pengfu.cn/thumb/160927/57e9bc889795e.jpg', gifsrcImg='http://image3.pengfu.cn/origin/160927/57e9bc889795e.gif', width='400', height='225'}}
JokeBean{userName='发生在货运电梯里的爱情故事', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/358/2041358.jpg', tags=[动态图, 涨姿势, 惊呆], dataBean=DataBean{content='null', showImg='http://image3.pengfu.cn/thumb/160926/57e86d77d844b.jpg', gifsrcImg='http://image3.pengfu.cn/origin/160926/57e86d77d844b.gif', width='242', height='175'}}
JokeBean{userName='连续锻炼365天的照片并做成动态图', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[动态图, 碉堡, 新纪元, 吐槽], dataBean=DataBean{content='null', showImg='http://image4.pengfu.cn/thumb/160927/57e9bf58af54f.jpg', gifsrcImg='http://image4.pengfu.cn/origin/160927/57e9bf58af54f.gif', width='150', height='353'}}
JokeBean{userName='求谜底', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/824/9764824.jpg', tags=[碉堡, 亮了, 新纪元, 吐槽], dataBean=DataBean{content='null', showImg='http://image3.pengfu.cn/origin/160926/57e8bdab6f669.jpg', gifsrcImg='', width='510', height='836'}}
JokeBean{userName='阿三的世界', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/941/9764941.jpg', tags=[动态图, 阿三, 新纪元, 雷人囧事], dataBean=DataBean{content='null', showImg='http://image5.pengfu.cn/thumb/160926/57e8b6e53c8f3.jpg', gifsrcImg='http://image5.pengfu.cn/origin/160926/57e8b6e53c8f3.gif', width='375', height='275'}}
JokeBean{userName='主人有话好好说!!!', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/941/9764941.jpg', tags=[亮了, 新纪元, 吐槽], dataBean=DataBean{content='null', showImg='http://image5.pengfu.cn/thumb/160926/57e8826861472.jpg', gifsrcImg='http://image5.pengfu.cn/origin/160926/57e8826861472.gif', width='156', height='175'}}
JokeBean{userName='画面太震撼……差点吓得叫出来了', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/791/9764791.jpg', tags=[动态图, 碉堡, 新纪元], dataBean=DataBean{content='null', showImg='http://image1.pengfu.cn/thumb/160926/57e87b9696248.jpg', gifsrcImg='http://image1.pengfu.cn/origin/160926/57e87b9696248.gif', width='275', height='500'}}
JokeBean{userName='这次真猜不出来，大家帮忙猜猜', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/791/9764791.jpg', tags=[亮了, 新纪元, 奇葩, 城会玩], dataBean=DataBean{content='null', showImg='http://image2.pengfu.cn/origin/160926/57e87b09c95a1.jpg', gifsrcImg='', width='510', height='594'}}
JokeBean{userName='天下武功 无坚不摧 唯快不破！', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/794/9764794.jpg', tags=[动态图, 小正太, 熊孩子, 城会玩], dataBean=DataBean{content='null', showImg='http://image1.pengfu.cn/thumb/160926/57e879aa662d7.jpg', gifsrcImg='http://image1.pengfu.cn/origin/160926/57e879aa662d7.gif', width='300', height='196'}}
```
###51妹子-最新-妹子详情
```
MeiziDetail{tag=null, imgBeans=[ImageBean{detailUrl='http://www.51xw.net/meizi/3863_1.html', imgUrl='http://c15.51xw.net/thumb/84x125/1/01c60cc05bf7a7.jpg', imgUrlLarge='http://c15.51xw.net/img/1,01c60cc05bf7a7.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(1)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_2.html', imgUrl='http://c.51xw.net/thumb/84x125/3/01c60d1ae87851.jpg', imgUrlLarge='http://c.51xw.net/img/3,01c60d1ae87851.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(2)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_3.html', imgUrl='http://c.51xw.net/thumb/84x125/3/01c60e872e6669.jpg', imgUrlLarge='http://c.51xw.net/img/3,01c60e872e6669.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(3)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_4.html', imgUrl='http://c.51xw.net/thumb/84x125/1/01c60f19cea6d6.jpg', imgUrlLarge='http://c.51xw.net/img/1,01c60f19cea6d6.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(4)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_5.html', imgUrl='http://c15.51xw.net/thumb/84x125/6/01c61018b73661.jpg', imgUrlLarge='http://c15.51xw.net/img/6,01c61018b73661.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(5)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_6.html', imgUrl='http://c15.51xw.net/thumb/84x125/2/01c6119d7a6901.jpg', imgUrlLarge='http://c15.51xw.net/img/2,01c6119d7a6901.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(6)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_7.html', imgUrl='http://c15.51xw.net/thumb/84x125/1/01c6127f0a2d0b.jpg', imgUrlLarge='http://c15.51xw.net/img/1,01c6127f0a2d0b.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(7)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_8.html', imgUrl='http://c.51xw.net/thumb/84x125/6/01c6130e9d7bdd.jpg', imgUrlLarge='http://c.51xw.net/img/6,01c6130e9d7bdd.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(8)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_9.html', imgUrl='http://c.51xw.net/thumb/84x125/3/01c6148fabd5b9.jpg', imgUrlLarge='http://c.51xw.net/img/3,01c6148fabd5b9.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(9)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_10.html', imgUrl='http://c15.51xw.net/thumb/84x125/5/01c6152613d78c.jpg', imgUrlLarge='http://c15.51xw.net/img/5,01c6152613d78c.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(10)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_11.html', imgUrl='http://c15.51xw.net/thumb/84x125/4/01c616925fa7f4.jpg', imgUrlLarge='http://c15.51xw.net/img/4,01c616925fa7f4.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(11)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_12.html', imgUrl='http://c.51xw.net/thumb/84x125/3/01c617bca1fb30.jpg', imgUrlLarge='http://c.51xw.net/img/3,01c617bca1fb30.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(12)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_13.html', imgUrl='http://c15.51xw.net/thumb/84x125/7/01c618da0d7d9b.jpg', imgUrlLarge='http://c15.51xw.net/img/7,01c618da0d7d9b.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(13)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_14.html', imgUrl='http://c15.51xw.net/thumb/84x125/3/01c6197aa791b6.jpg', imgUrlLarge='http://c15.51xw.net/img/3,01c6197aa791b6.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(14)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_15.html', imgUrl='http://c15.51xw.net/thumb/84x125/1/01c61af34ab625.jpg', imgUrlLarge='http://c15.51xw.net/img/1,01c61af34ab625.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(15)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_16.html', imgUrl='http://c15.51xw.net/thumb/84x125/1/01c61b170596bc.jpg', imgUrlLarge='http://c15.51xw.net/img/1,01c61b170596bc.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(16)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_17.html', imgUrl='http://c15.51xw.net/thumb/84x125/2/01c61c1676397c.jpg', imgUrlLarge='http://c15.51xw.net/img/2,01c61c1676397c.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(17)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_18.html', imgUrl='http://c15.51xw.net/thumb/84x125/7/01c61d57590321.jpg', imgUrlLarge='http://c15.51xw.net/img/7,01c61d57590321.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(18)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_19.html', imgUrl='http://c15.51xw.net/thumb/84x125/5/01c61e027a9b50.jpg', imgUrlLarge='http://c15.51xw.net/img/5,01c61e027a9b50.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(19)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_20.html', imgUrl='http://c15.51xw.net/thumb/84x125/3/01c61f984dd27f.jpg', imgUrlLarge='http://c15.51xw.net/img/3,01c61f984dd27f.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(20)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_21.html', imgUrl='http://c15.51xw.net/thumb/84x125/3/01c620997d6c51.jpg', imgUrlLarge='http://c15.51xw.net/img/3,01c620997d6c51.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(21)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_22.html', imgUrl='http://c15.51xw.net/thumb/84x125/2/01c6217624a9b3.jpg', imgUrlLarge='http://c15.51xw.net/img/2,01c6217624a9b3.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(22)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_23.html', imgUrl='http://c15.51xw.net/thumb/84x125/5/01c6228146c71e.jpg', imgUrlLarge='http://c15.51xw.net/img/5,01c6228146c71e.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(23)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_24.html', imgUrl='http://c15.51xw.net/thumb/84x125/3/01c623705c69a5.jpg', imgUrlLarge='http://c15.51xw.net/img/3,01c623705c69a5.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(24)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_25.html', imgUrl='http://c.51xw.net/thumb/84x125/5/01c624ac8abb1e.jpg', imgUrlLarge='http://c.51xw.net/img/5,01c624ac8abb1e.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(25)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_26.html', imgUrl='http://c15.51xw.net/thumb/84x125/1/01c6255893c1b8.jpg', imgUrlLarge='http://c15.51xw.net/img/1,01c6255893c1b8.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(26)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_27.html', imgUrl='http://c15.51xw.net/thumb/84x125/3/01c626b4efed9f.jpg', imgUrlLarge='http://c15.51xw.net/img/3,01c626b4efed9f.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(27)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_28.html', imgUrl='http://c15.51xw.net/thumb/84x125/4/01c627a1c2363b.jpg', imgUrlLarge='http://c15.51xw.net/img/4,01c627a1c2363b.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(28)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_29.html', imgUrl='http://c15.51xw.net/thumb/84x125/1/01c62848400061.jpg', imgUrlLarge='http://c15.51xw.net/img/1,01c62848400061.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(29)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_30.html', imgUrl='http://c.51xw.net/thumb/84x125/1/01c62907d65cdc.jpg', imgUrlLarge='http://c.51xw.net/img/1,01c62907d65cdc.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(30)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_31.html', imgUrl='http://c15.51xw.net/thumb/84x125/7/01c62a34cda81b.jpg', imgUrlLarge='http://c15.51xw.net/img/7,01c62a34cda81b.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(31)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_32.html', imgUrl='http://c.51xw.net/thumb/84x125/2/01c62b91e9b320.jpg', imgUrlLarge='http://c.51xw.net/img/2,01c62b91e9b320.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(32)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_33.html', imgUrl='http://c15.51xw.net/thumb/84x125/1/01c62c029c8989.jpg', imgUrlLarge='http://c15.51xw.net/img/1,01c62c029c8989.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(33)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_34.html', imgUrl='http://c.51xw.net/thumb/84x125/7/01c62d89d01947.jpg', imgUrlLarge='http://c.51xw.net/img/7,01c62d89d01947.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(34)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_35.html', imgUrl='http://c15.51xw.net/thumb/84x125/6/01c62e34bfc8ea.jpg', imgUrlLarge='http://c15.51xw.net/img/6,01c62e34bfc8ea.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(35)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_36.html', imgUrl='http://c15.51xw.net/thumb/84x125/6/01c62f1dd1b1eb.jpg', imgUrlLarge='http://c15.51xw.net/img/6,01c62f1dd1b1eb.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(36)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_37.html', imgUrl='http://c15.51xw.net/thumb/84x125/7/01c630c55e7bd5.jpg', imgUrlLarge='http://c15.51xw.net/img/7,01c630c55e7bd5.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(37)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_38.html', imgUrl='http://c15.51xw.net/thumb/84x125/2/01c631de5eb506.jpg', imgUrlLarge='http://c15.51xw.net/img/2,01c631de5eb506.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(38)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_39.html', imgUrl='http://c.51xw.net/thumb/84x125/2/01c6321679ac19.jpg', imgUrlLarge='http://c.51xw.net/img/2,01c6321679ac19.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(39)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_40.html', imgUrl='http://c15.51xw.net/thumb/84x125/7/01c6330fe15af5.jpg', imgUrlLarge='http://c15.51xw.net/img/7,01c6330fe15af5.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(40)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_41.html', imgUrl='http://c.51xw.net/thumb/84x125/3/01c6343241451d.jpg', imgUrlLarge='http://c.51xw.net/img/3,01c6343241451d.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(41)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_42.html', imgUrl='http://c15.51xw.net/thumb/84x125/7/01c635c99dfc8b.jpg', imgUrlLarge='http://c15.51xw.net/img/7,01c635c99dfc8b.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(42)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_43.html', imgUrl='http://c15.51xw.net/thumb/84x125/3/01c636a17913ee.jpg', imgUrlLarge='http://c15.51xw.net/img/3,01c636a17913ee.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(43)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_44.html', imgUrl='http://c.51xw.net/thumb/84x125/7/01c637ed5ae5a4.jpg', imgUrlLarge='http://c.51xw.net/img/7,01c637ed5ae5a4.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(44)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_45.html', imgUrl='http://c15.51xw.net/thumb/84x125/7/01c63889bb0048.jpg', imgUrlLarge='http://c15.51xw.net/img/7,01c63889bb0048.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(45)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_46.html', imgUrl='http://c15.51xw.net/thumb/84x125/2/01c639ee13d7a0.jpg', imgUrlLarge='http://c15.51xw.net/img/2,01c639ee13d7a0.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(46)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_47.html', imgUrl='http://c.51xw.net/thumb/84x125/6/01c63ab4c930b9.jpg', imgUrlLarge='http://c.51xw.net/img/6,01c63ab4c930b9.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(47)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_48.html', imgUrl='http://c15.51xw.net/thumb/84x125/7/01c63b07ee6c21.jpg', imgUrlLarge='http://c15.51xw.net/img/7,01c63b07ee6c21.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(48)'}, ImageBean{detailUrl='http://www.51xw.net/meizi/3863_49.html', imgUrl='http://c.51xw.net/thumb/84x125/6/01c63c5c082c9f.jpg', imgUrlLarge='http://c.51xw.net/img/6,01c63c5c082c9f.jpg', width='84', height='125', title='陈思雨大尺度玉体美乳诱惑写真下载(49)'}]}

```
##捧腹网

###捧腹网-最新笑话
```
JokeBean{userName='我擦，不能让老板知道我就是那个傻 逼！', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/793/9764793.jpg', tags=[], dataBean=DataBean{content='去买鞋，看到鞋架上放着一双和我脚上一模一样的鞋标注五 折！问老板：这鞋怎么降价这么快，我前几天买鞋时都不打 折？ 老板郁闷的说：这两只鞋，一只37一只38，不知道那个傻 逼拿错鞋也不知道回来换换！ 心里一惊，偷偷的喵了一眼脚下的鞋号……我擦，不能让老板知道我就是那个傻 逼！', showImg='null', gifsrcImg='null', width='null', height='null'}}
JokeBean{userName='女友太邪恶了，吃个豆浆都这么污...', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/794/9764794.jpg', tags=[每日图宴, 奇葩, 无节操, 邪恶内涵], dataBean=DataBean{content='null', showImg='http://image4.pengfu.cn/origin/160927/57e9ee662d573.jpg', gifsrcImg='', width='454', height='451'}}
JokeBean{userName='有创意的美容广告', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[碉堡, 亮了, 惊呆, 城会玩], dataBean=DataBean{content='null', showImg='http://image4.pengfu.cn/origin/160927/57e9b9c5b3e54.jpg', gifsrcImg='', width='490', height='601'}}
JokeBean{userName='熊猫夫妇亲热被偷窥狂打断', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/358/2041358.jpg', tags=[动态图, 亮了, 新纪元, 吐槽], dataBean=DataBean{content='null', showImg='http://image3.pengfu.cn/thumb/160927/57e9bc889795e.jpg', gifsrcImg='http://image3.pengfu.cn/origin/160927/57e9bc889795e.gif', width='400', height='225'}}
JokeBean{userName='我的兄弟马上就来！', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/285/9765285.jpg', tags=[亮了, 吐槽, 找亮点, 城会玩], dataBean=DataBean{content='null', showImg='http://image5.pengfu.cn/thumb/160927/57e9a1f6d40c3.jpg', gifsrcImg='http://image5.pengfu.cn/origin/160927/57e9a1f6d40c3.gif', width='500', height='278'}}
JokeBean{userName='发生在货运电梯里的爱情故事', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/358/2041358.jpg', tags=[动态图, 涨姿势, 惊呆], dataBean=DataBean{content='null', showImg='http://image3.pengfu.cn/thumb/160926/57e86d77d844b.jpg', gifsrcImg='http://image3.pengfu.cn/origin/160926/57e86d77d844b.gif', width='242', height='175'}}
JokeBean{userName='啥都来不及说了，快跑', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[动态图, 亮了, 大写的懵逼], dataBean=DataBean{content='null', showImg='http://image5.pengfu.cn/thumb/160927/57e9beec9c891.jpg', gifsrcImg='http://image5.pengfu.cn/origin/160927/57e9beec9c891.gif', width='250', height='373'}}
JokeBean{userName='幸福来得太突然', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/707/6518707.jpg', tags=[动态图, 亮了, 新纪元, 无节操], dataBean=DataBean{content='null', showImg='http://image5.pengfu.cn/thumb/160927/57e9b12d193db.jpg', gifsrcImg='http://image5.pengfu.cn/origin/160927/57e9b12d193db.gif', width='360', height='244'}}
JokeBean{userName='连续锻炼365天的照片并做成动态图', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[动态图, 碉堡, 新纪元, 吐槽], dataBean=DataBean{content='null', showImg='http://image4.pengfu.cn/thumb/160927/57e9bf58af54f.jpg', gifsrcImg='http://image4.pengfu.cn/origin/160927/57e9bf58af54f.gif', width='150', height='353'}}
JokeBean{userName='乖乖叼好', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/336/9762336.jpg', tags=[动态图, 萌宠, 汪星人, 亮了], dataBean=DataBean{content='null', showImg='http://image5.pengfu.cn/thumb/160927/57e9b6829b51a.jpg', gifsrcImg='http://image5.pengfu.cn/origin/160927/57e9b6829b51a.gif', width='212', height='212'}}
```
###捧腹网-捧腹段子
```
JokeBean{userName='我擦，不能让老板知道我就是那个傻 逼！', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/793/9764793.jpg', tags=[], dataBean=DataBean{content='去买鞋，看到鞋架上放着一双和我脚上一模一样的鞋标注五 折！问老板：这鞋怎么降价这么快，我前几天买鞋时都不打 折？ 老板郁闷的说：这两只鞋，一只37一只38，不知道那个傻 逼拿错鞋也不知道回来换换！ 心里一惊，偷偷的喵了一眼脚下的鞋号……我擦，不能让老板知道我就是那个傻 逼！', showImg='null', gifsrcImg='null', width='null', height='null'}}
JokeBean{userName='老师这是误会！', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/793/9764793.jpg', tags=[], dataBean=DataBean{content='老师这是误会！肯定是误会啊！ 快睡觉的时候和床下的同学打闹，谁知道这时班主任来查房了，正巧我骑在那同学的身上，而且我只穿一条小裤衩。老师你别误会，只是打闹不是搞基("▔㉨▔)汗', showImg='null', gifsrcImg='null', width='null', height='null'}}
JokeBean{userName='我爸爸的弟弟...', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/793/9764793.jpg', tags=[], dataBean=DataBean{content='今天跟单位女同事去吃酒席，都知道的，随礼要送份子钱，她叔叔让她带送一份，背景交代完毕—— 记账的时候， 她说 ：这份是我叔叔的， 对方问：你叔叔是谁？ 她回答：就是我叔叔啊； 对方：我问你叔叔是哪个 ？ 就是我爸爸的弟弟啊……… 苍天啊，我发誓，我真的不认识她………', showImg='null', gifsrcImg='null', width='null', height='null'}}
JokeBean{userName='这可是我的亲孙女！', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/793/9764793.jpg', tags=[], dataBean=DataBean{content='老妈哄小侄女吃感 冒药，小侄女咬紧牙关就是不张嘴！我说：一巴掌打哭她，张大嘴哭时把药给她吃了。 老妈悠悠的说：这可是我的亲孙女！ 哎～妈，你这啥意思，我小时候不吃药，不都是被你打哭了，硬塞我嘴里的吗…然后看我不哭了你又一巴掌…', showImg='null', gifsrcImg='null', width='null', height='null'}}
JokeBean{userName='售货员一脸懵逼！', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/793/9764793.jpg', tags=[], dataBean=DataBean{content='去药店买感冒药，买完药，售货员说多喝水就好了，然后我就把药退了，回家喝水去了！留下售货员一脸懵逼！', showImg='null', gifsrcImg='null', width='null', height='null'}}
JokeBean{userName='你们这的人好会拍马屁啊！', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/793/9764793.jpg', tags=[], dataBean=DataBean{content='我们那边是管婶婶叫（美眉）的，我在村里辈分比较大。记得第一次带女票回家，一路上好多人管女票叫美眉，我也忘了告诉她那是婶婶的意思。女票转过头笑眯眯的对我说道：你们这的人好会拍马屁啊！人家一点都不美吗？我：你终于说了句实话了，不过他们是叫你婶婶的意思别想多了。女票：…………', showImg='null', gifsrcImg='null', width='null', height='null'}}
JokeBean{userName='一气之下就把手机摔了……', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/793/9764793.jpg', tags=[], dataBean=DataBean{content='大早上，我弟就敲响了我家的门，非让我赔偿他一部手机不可！原因是，我昨晚在家庭群里发了个5块钱的红包，喝醉后的弟弟只抢到了2分钱，一气之下就把手机摔了……', showImg='null', gifsrcImg='null', width='null', height='null'}}
JokeBean{userName='滚犊子，明天别来了！', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/331/9765331.jpg', tags=[], dataBean=DataBean{content='老师问学生：牛贵，还是鸡贵？ 抢答：鸡贵。 老师：为什么？ 小明：九牛才一毛，鸡八毛。 老师：滚出去… 生物课上老师又说：狼和狗杂交的叫狼狗，老虎和狮子呢。 小明又抢答：叫老狮 老师马上吼道：滚犊子，明天别来了！……', showImg='null', gifsrcImg='null', width='null', height='null'}}
JokeBean{userName='看来我只能去旅馆了！', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/793/9764793.jpg', tags=[], dataBean=DataBean{content='当年初中时一次晚自习，一同学不但迟到了，而且还趴在桌上睡大觉。老师叫醒他后说：要睡回家睡去！ 他却说：我就是因为在家睡觉，才被我爸赶到学校的，你现在却要让我回家，看来我只能去旅馆了！ 说完背着书包就走了。', showImg='null', gifsrcImg='null', width='null', height='null'}}
JokeBean{userName='她会吃香蕉呀？', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/793/9764793.jpg', tags=[], dataBean=DataBean{content='今天朋友发给我一张她8个多月大女儿的照片，照片中小宝宝手拿着吃了一半的香蕉，撇着嘴在哭。我很惊奇地问朋友，“她会吃香蕉呀？”朋友回答：“是啊。”我又问：“那她为什么哭得这么伤心？”朋友的回答把我笑喷了：“穿得太厚了，她胳膊又短，吃了一半够不着了。”', showImg='null', gifsrcImg='null', width='null', height='null'}}
```
###捧腹网-捧腹图片
```
JokeBean{userName='都不好意思看你们在干神马', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/794/9764794.jpg', tags=[每日图宴, 亮了, 惊呆], dataBean=DataBean{content='null', showImg='http://image1.pengfu.cn/origin/160927/57e9eeae599c2.jpg', gifsrcImg='', width='426', height='453'}}
JokeBean{userName='让我怎么吐槽呢？来个神回复吧！', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/794/9764794.jpg', tags=[每日图宴, 神回复, 亮了, 吐槽], dataBean=DataBean{content='null', showImg='http://image1.pengfu.cn/origin/160927/57e9ee8ca3d07.jpg', gifsrcImg='', width='410', height='298'}}
JokeBean{userName='女友太邪恶了，吃个豆浆都这么污...', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/794/9764794.jpg', tags=[每日图宴, 奇葩, 无节操, 邪恶内涵], dataBean=DataBean{content='null', showImg='http://image4.pengfu.cn/origin/160927/57e9ee662d573.jpg', gifsrcImg='', width='454', height='451'}}
JokeBean{userName='有创意的美容广告', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[碉堡, 亮了, 惊呆, 城会玩], dataBean=DataBean{content='null', showImg='http://image4.pengfu.cn/origin/160927/57e9b9c5b3e54.jpg', gifsrcImg='', width='490', height='601'}}
JokeBean{userName='啥都来不及说了，快跑', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[动态图, 亮了, 大写的懵逼], dataBean=DataBean{content='null', showImg='http://image5.pengfu.cn/thumb/160927/57e9beec9c891.jpg', gifsrcImg='http://image5.pengfu.cn/origin/160927/57e9beec9c891.gif', width='250', height='373'}}
JokeBean{userName='熊猫夫妇亲热被偷窥狂打断', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/358/2041358.jpg', tags=[动态图, 亮了, 新纪元, 吐槽], dataBean=DataBean{content='null', showImg='http://image3.pengfu.cn/thumb/160927/57e9bc889795e.jpg', gifsrcImg='http://image3.pengfu.cn/origin/160927/57e9bc889795e.gif', width='400', height='225'}}
JokeBean{userName='发生在货运电梯里的爱情故事', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/358/2041358.jpg', tags=[动态图, 涨姿势, 惊呆], dataBean=DataBean{content='null', showImg='http://image3.pengfu.cn/thumb/160926/57e86d77d844b.jpg', gifsrcImg='http://image3.pengfu.cn/origin/160926/57e86d77d844b.gif', width='242', height='175'}}
JokeBean{userName='美国男子用舌头舔眼睛发短信', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/707/6518707.jpg', tags=[碉堡, 吐槽, 逆天, 惊呆], dataBean=DataBean{content='null', showImg='http://image4.pengfu.cn/origin/160927/57e9ab0cb83c8.jpg', gifsrcImg='', width='476', height='492'}}
JokeBean{userName='我的兄弟马上就来！', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/285/9765285.jpg', tags=[亮了, 吐槽, 找亮点, 城会玩], dataBean=DataBean{content='null', showImg='http://image5.pengfu.cn/thumb/160927/57e9a1f6d40c3.jpg', gifsrcImg='http://image5.pengfu.cn/origin/160927/57e9a1f6d40c3.gif', width='500', height='278'}}
JokeBean{userName='剩女的睡枕', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/707/6518707.jpg', tags=[亮了, 新纪元, 二货, 吐槽], dataBean=DataBean{content='null', showImg='http://image4.pengfu.cn/origin/160927/57e9a9ccecbc7.jpg', gifsrcImg='', width='510', height='271'}}
JokeBean{userName='不同年代的人怎样挤牙膏', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[雷人囧事, 二货, 吐槽], dataBean=DataBean{content='null', showImg='http://image3.pengfu.cn/origin/160927/57e9ba418751e.jpg', gifsrcImg='', width='432', height='542'}}
JokeBean{userName='这特么谁做的图？笑cry在厕所！', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/707/6518707.jpg', tags=[动态图, 亮了, 新纪元, 惊呆], dataBean=DataBean{content='null', showImg='http://image5.pengfu.cn/thumb/160927/57e9af9608db0.jpg', gifsrcImg='http://image5.pengfu.cn/origin/160927/57e9af9608db0.gif', width='400', height='225'}}
JokeBean{userName='【今日话题】你的梦想是什么？', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/723/4240723.jpg', tags=[今日话题], dataBean=DataBean{content='null', showImg='http://image1.pengfu.cn/thumb/160927/57e9daba794e7.jpg', gifsrcImg='', width='440', height='420'}}
JokeBean{userName='美女还真是省布料', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/263/3428263.jpg', tags=[美女], dataBean=DataBean{content='null', showImg='http://image3.pengfu.cn/origin/160927/57e9c76ea76e2.jpg', gifsrcImg='', width='510', height='765'}}
JokeBean{userName='女生宿舍的日常', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[动态图, 亮了, 雷人囧事, 吐槽], dataBean=DataBean{content='null', showImg='http://image1.pengfu.cn/thumb/160927/57e9bff40f6ff.jpg', gifsrcImg='http://image1.pengfu.cn/origin/160927/57e9bff40f6ff.gif', width='184', height='224'}}
JokeBean{userName='好坏的男生，应该严肃处理', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[动态图, 亮了, 雷人囧事, 作死], dataBean=DataBean{content='null', showImg='http://image1.pengfu.cn/thumb/160927/57e9bfb52fa31.jpg', gifsrcImg='http://image1.pengfu.cn/origin/160927/57e9bfb52fa31.gif', width='240', height='320'}}
JokeBean{userName='男人一旦火了。。。。。。', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[动态图, 亮了, 新纪元, 雷人囧事], dataBean=DataBean{content='null', showImg='http://image4.pengfu.cn/thumb/160927/57e9bf9dec018.jpg', gifsrcImg='http://image4.pengfu.cn/origin/160927/57e9bf9dec018.gif', width='348', height='302'}}
JokeBean{userName='连续锻炼365天的照片并做成动态图', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[动态图, 碉堡, 新纪元, 吐槽], dataBean=DataBean{content='null', showImg='http://image4.pengfu.cn/thumb/160927/57e9bf58af54f.jpg', gifsrcImg='http://image4.pengfu.cn/origin/160927/57e9bf58af54f.gif', width='150', height='353'}}
JokeBean{userName='好大的风，把我假牙都吹掉了', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[悲剧, 动态图, 雷人囧事, 糗大了], dataBean=DataBean{content='null', showImg='http://image5.pengfu.cn/thumb/160927/57e9be9b73c72.jpg', gifsrcImg='http://image5.pengfu.cn/origin/160927/57e9be9b73c72.gif', width='280', height='166'}}
JokeBean{userName='动物中的损友', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[动态图, 亮了, 新纪元, 吐槽], dataBean=DataBean{content='null', showImg='http://image4.pengfu.cn/thumb/160927/57e9be82c5e57.jpg', gifsrcImg='http://image4.pengfu.cn/origin/160927/57e9be82c5e57.gif', width='245', height='200'}}
```
###捧腹网-神回复
```
JokeBean{userName='有创意的美容广告', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[碉堡, 亮了, 惊呆, 城会玩], dataBean=DataBean{content='null', showImg='http://image4.pengfu.cn/origin/160927/57e9b9c5b3e54.jpg', gifsrcImg='', width='490', height='601'}}
JokeBean{userName='熊猫夫妇亲热被偷窥狂打断', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/358/2041358.jpg', tags=[动态图, 亮了, 新纪元, 吐槽], dataBean=DataBean{content='null', showImg='http://image3.pengfu.cn/thumb/160927/57e9bc889795e.jpg', gifsrcImg='http://image3.pengfu.cn/origin/160927/57e9bc889795e.gif', width='400', height='225'}}
JokeBean{userName='发生在货运电梯里的爱情故事', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/358/2041358.jpg', tags=[动态图, 涨姿势, 惊呆], dataBean=DataBean{content='null', showImg='http://image3.pengfu.cn/thumb/160926/57e86d77d844b.jpg', gifsrcImg='http://image3.pengfu.cn/origin/160926/57e86d77d844b.gif', width='242', height='175'}}
JokeBean{userName='连续锻炼365天的照片并做成动态图', lastTime='2016-09-27', userAvatar='http://avatar.pengfu.cn/small/975/5104975.jpg', tags=[动态图, 碉堡, 新纪元, 吐槽], dataBean=DataBean{content='null', showImg='http://image4.pengfu.cn/thumb/160927/57e9bf58af54f.jpg', gifsrcImg='http://image4.pengfu.cn/origin/160927/57e9bf58af54f.gif', width='150', height='353'}}
JokeBean{userName='求谜底', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/824/9764824.jpg', tags=[碉堡, 亮了, 新纪元, 吐槽], dataBean=DataBean{content='null', showImg='http://image3.pengfu.cn/origin/160926/57e8bdab6f669.jpg', gifsrcImg='', width='510', height='836'}}
JokeBean{userName='阿三的世界', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/941/9764941.jpg', tags=[动态图, 阿三, 新纪元, 雷人囧事], dataBean=DataBean{content='null', showImg='http://image5.pengfu.cn/thumb/160926/57e8b6e53c8f3.jpg', gifsrcImg='http://image5.pengfu.cn/origin/160926/57e8b6e53c8f3.gif', width='375', height='275'}}
JokeBean{userName='主人有话好好说!!!', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/941/9764941.jpg', tags=[亮了, 新纪元, 吐槽], dataBean=DataBean{content='null', showImg='http://image5.pengfu.cn/thumb/160926/57e8826861472.jpg', gifsrcImg='http://image5.pengfu.cn/origin/160926/57e8826861472.gif', width='156', height='175'}}
JokeBean{userName='画面太震撼……差点吓得叫出来了', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/791/9764791.jpg', tags=[动态图, 碉堡, 新纪元], dataBean=DataBean{content='null', showImg='http://image1.pengfu.cn/thumb/160926/57e87b9696248.jpg', gifsrcImg='http://image1.pengfu.cn/origin/160926/57e87b9696248.gif', width='275', height='500'}}
JokeBean{userName='这次真猜不出来，大家帮忙猜猜', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/791/9764791.jpg', tags=[亮了, 新纪元, 奇葩, 城会玩], dataBean=DataBean{content='null', showImg='http://image2.pengfu.cn/origin/160926/57e87b09c95a1.jpg', gifsrcImg='', width='510', height='594'}}
JokeBean{userName='天下武功 无坚不摧 唯快不破！', lastTime='2016-09-26', userAvatar='http://avatar.pengfu.cn/small/794/9764794.jpg', tags=[动态图, 小正太, 熊孩子, 城会玩], dataBean=DataBean{content='null', showImg='http://image1.pengfu.cn/thumb/160926/57e879aa662d7.jpg', gifsrcImg='http://image1.pengfu.cn/origin/160926/57e879aa662d7.gif', width='300', height='196'}}
```


##51贴图
###51贴图-首页
```
<!-- Banner -->
TieTuBannerBean{imgUrl='http://img2.51tietu.net/upload/20160802/20160802015625ycAv5.jpg', detailUrl='http://www.51tietu.net/tag/%E5%A5%B3%E7%94%9F/'}
TieTuBannerBean{imgUrl='http://img2.51tietu.net/upload/20160802/20160802013921r6xwb.jpg', detailUrl='http://www.51tietu.net/tag/%E6%AF%95%E4%B8%9A/'}
TieTuBannerBean{imgUrl='http://img2.51tietu.net/upload/20160802/20160802013823XGvfE.jpg', detailUrl='http://www.51tietu.net/tag/%E5%A4%8F%E5%A4%A9/'}
TieTuBannerBean{imgUrl='http://img2.51tietu.net/upload/20160802/201608020136382T6kW.jpg', detailUrl='http://www.51tietu.net/pic/%E6%96%97%E5%9B%BE/'}

<!-- 图片广场 -->
TieTuHomeListBean{title='Black_white~8', imgUrl='http://img8.51tietu.net/pic/2016-062311/20160623115514o1rianusztt728112.jpg', detailUrl='http://m.51tietu.net/p/1138229.html'}
TieTuHomeListBean{title='萤火之森', imgUrl='http://img8.51tietu.net/pic/2016-062407/20160624073807kvt0lyvgic2883622.jpg', detailUrl='http://m.51tietu.net/p/1109571.html'}
TieTuHomeListBean{title='ALICE=ALICE', imgUrl='http://img8.51tietu.net/pic/2016-062405/20160624050855snhz31xuvev860924.jpg', detailUrl='http://m.51tietu.net/p/1109289.html'}
TieTuHomeListBean{title='#Chanel #Fashion', imgUrl='http://img10.51tietu.net/upload/thumb/20160906/20160706090347prvubx4s2oq280x180.jpg', detailUrl='http://m.51tietu.net/p/1092845.html'}
TieTuHomeListBean{title='啊咪的第二批肉片陆续发芽生长中~^o^~《Cat…', imgUrl='http://img10.51tietu.net/upload/thumb/20160906/20160706151443k2ch2xijsc0280x180.jpg', detailUrl='http://m.51tietu.net/p/1087304.html'}
TieTuHomeListBean{title='啊咪的第二批肉片陆续发芽生长中~^o^~《Cat…', imgUrl='http://img10.51tietu.net/upload/thumb/20160906/20160706151448vhylgl1cdkj280x180.jpg', detailUrl='http://m.51tietu.net/p/1087303.html'}
TieTuHomeListBean{title='线稿', imgUrl='http://img10.51tietu.net/upload/thumb/20160906/20160706160113qfbddyc0oqh280x180.jpg', detailUrl='http://m.51tietu.net/p/1086684.html'}
TieTuHomeListBean{title='西瓜超人', imgUrl='http://img8.51tietu.net/pic/2016-062411/201606241145460oy0kyh3pkk924827.jpg', detailUrl='http://m.51tietu.net/p/1085606.html'}
TieTuHomeListBean{title='我喜欢了 我讨厌了 影响不了我的呼吸 原来…', imgUrl='http://img10.51tietu.net/upload/thumb/20160906/20160706171219qysiz0pgtcv280x180.jpg', detailUrl='http://m.51tietu.net/p/1085605.html'}
TieTuHomeListBean{title='Florence + The Machine - Never Let Me Go…', imgUrl='http://img10.51tietu.net/upload/thumb/20160906/201607061808304hmqokc1h0g280x180.jpg', detailUrl='http://m.51tietu.net/p/1082623.html'}
TieTuHomeListBean{title='图片', imgUrl='http://img8.51tietu.net/pic/2016-062415/20160624152155x40oieacpag957888.jpg', detailUrl='http://m.51tietu.net/p/1070945.html'}
TieTuHomeListBean{title='琅琊榜--飞流。（图自微博）', imgUrl='http://img10.51tietu.net/upload/thumb/20160905/20160707034413zw1caghmimj280x180.jpg', detailUrl='http://m.51tietu.net/p/1069269.html'}
TieTuHomeListBean{title='2016春—Aylin König', imgUrl='http://img10.51tietu.net/upload/thumb/20160905/20160707061913lj3wryya0ph280x180.jpg', detailUrl='http://m.51tietu.net/p/1062264.html'}
TieTuHomeListBean{title='yande.re 279620 aoyama_sumika buruma coffee-kizoku gym_uniform royal_mountain th', imgUrl='http://img8.51tietu.net/pic/2016-070415/20160704151719yfvrawrbpth24890.jpg', detailUrl='http://m.51tietu.net/p/1062263.html'}
TieTuHomeListBean{title='搭配=心意+新意', imgUrl='http://img10.51tietu.net/upload/thumb/20160905/20160707075506z3sy4mkqjsl280x180.jpg', detailUrl='http://m.51tietu.net/p/1059257.html'}

<!-- 最近更新 -->
TieTuHomeListBean{title='', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160521181401eu3sqslqb5z96891280x180.jpg', detailUrl='http://m.51tietu.net/wenshen/42923.html'}
TieTuHomeListBean{title='', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718205546mupqcsmjqcc280x180.jpg', detailUrl='http://m.51tietu.net/fengjing/42922.html'}
TieTuHomeListBean{title='', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718234640t01oix4ojtg280x180.jpg', detailUrl='http://m.51tietu.net/kttp/42921.html'}
TieTuHomeListBean{title='', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160719000819hz2zgmav0eg280x180.jpg', detailUrl='http://m.51tietu.net/aiqing/42920.html'}
TieTuHomeListBean{title='', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718225727gi3hjujs3ik280x180.jpg', detailUrl='http://m.51tietu.net/tp/42919.html'}
TieTuHomeListBean{title='', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718215055qt2fyiydprq280x180.jpg', detailUrl='http://m.51tietu.net/xiaoqingxin/42918.html'}

<!-- 首页推荐 -->
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201210261835021070280x180.jpg', detailUrl='http://m.51tietu.net/qmt/14071.html'}
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201309260926427155280x180.jpg', detailUrl='http://m.51tietu.net/lomo/17785.html'}
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201410131107433344280x180.jpg', detailUrl='http://m.51tietu.net/lomo/19473.html'}
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201411051400362986280x180.jpg', detailUrl='http://m.51tietu.net/qmt/19646.html'}
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201501270354372329280x180.png', detailUrl='http://m.51tietu.net/lomo/19932.html'}
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201508041532086209280x180.jpg', detailUrl='http://m.51tietu.net/lomo/20299.html'}
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201510280828155255280x180.jpg', detailUrl='http://m.51tietu.net/qmt/20345.html'}
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201602180617484084280x180.png', detailUrl='http://m.51tietu.net/xiaoqingxin/20525.html'}
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201603011002207558280x180.jpg', detailUrl='http://m.51tietu.net/aiqing/20600.html'}
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201603030922371508280x180.jpg', detailUrl='http://m.51tietu.net/xiaoqingxin/20633.html'}
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201603110950336133280x180.jpg', detailUrl='http://m.51tietu.net/aiqing/20756.html'}
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201603220924314749280x180.jpg', detailUrl='http://m.51tietu.net/xiaoqingxin/20859.html'}
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201603250739352916280x180.png', detailUrl='http://m.51tietu.net/xiaoqingxin/20885.html'}
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201603300435534062280x180.jpg', detailUrl='http://m.51tietu.net/tp/20917.html'}
TieTuHomeListBean{title='', imgUrl='http://img.51tietu.net/upload/thumb/20160830/201603311216198397280x180.jpg', detailUrl='http://m.51tietu.net/xiaoqingxin/20924.html'}

<!-- 精美文章 -->
TieTuHomeListBean{title='', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160619151700xbn3nvghdz133280x180.jpg', detailUrl='http://m.51tietu.net/weitu/42139.html'}
TieTuHomeListBean{title='', imgUrl='http://img2.51tietu.net/upload/thumb/20160926/20160619151702oz4ylljf2fv39280x180.jpg', detailUrl='http://m.51tietu.net/weitu/42126.html'}
TieTuHomeListBean{title='', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160619151703e0b25cdrxoq48280x180.jpg', detailUrl='http://m.51tietu.net/weitu/42112.html'}
TieTuHomeListBean{title='', imgUrl='http://img2.51tietu.net/upload/thumb/20160926/201606191517043b2nwuwvbzw50280x180.jpg', detailUrl='http://m.51tietu.net/weitu/42098.html'}
TieTuHomeListBean{title='', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160619151705ac3fx4c2prt54280x180.jpg', detailUrl='http://m.51tietu.net/weitu/42080.html'}
TieTuHomeListBean{title='', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160619151656rbsriacwxbl14280x180.jpg', detailUrl='http://m.51tietu.net/weitu/42066.html'}
```
###51贴图-根据类型查看图片列表
```
TieTuListBean{title='鲜花唯美意境非主流QQ空', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718222628o1utikutlil280x180.jpg', detailUrl='http://m.51tietu.net/tp/42929.html'}
TieTuListBean{title='女生图片素材唯美伤感背影', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718225727gi3hjujs3ik280x180.jpg', detailUrl='http://m.51tietu.net/tp/42919.html'}
TieTuListBean{title='情侣非主流图片唯美有意境', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718233443arqp2rtr00p280x180.jpg', detailUrl='http://m.51tietu.net/tp/42906.html'}
TieTuListBean{title='夜总会个性美女侧脸图片', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/201607182310165vte0q1adc0280x180.jpg', detailUrl='http://m.51tietu.net/tp/42894.html'}
TieTuListBean{title='曾经的承诺太美现在的谎言', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718222148tz1uj05ybgn280x180.jpg', detailUrl='http://m.51tietu.net/tp/42883.html'}
TieTuListBean{title='甜蜜亲吻亲密情侣唯美图片', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160719000754a05nqfqmxic280x180.jpg', detailUrl='http://m.51tietu.net/tp/42872.html'}
TieTuListBean{title='qq唯美女生图片伤感颓废', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718224007rvnven2mnus280x180.jpg', detailUrl='http://m.51tietu.net/tp/42850.html'}
TieTuListBean{title='qq唯美女生图片伤感颓废', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718224007rvnven2mnus280x180.jpg', detailUrl='http://m.51tietu.net/tp/42849.html'}
TieTuListBean{title='美女背影图片唯美非主流', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718232047uxwtw3amjha280x180.jpg', detailUrl='http://m.51tietu.net/tp/42837.html'}
TieTuListBean{title='唯美lomo意境心形折纸', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718214502nfpwgsyreco280x180.jpg', detailUrl='http://m.51tietu.net/tp/42823.html'}
TieTuListBean{title='lomo唯美意境摄影图片', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718222511ochwbrrzbmp280x180.jpg', detailUrl='http://m.51tietu.net/tp/42812.html'}
TieTuListBean{title='创意空间设计带英文唯美图', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718223629zytgjqenbt5280x180.jpg', detailUrl='http://m.51tietu.net/tp/42801.html'}
TieTuListBean{title='漫少女、卡哇伊', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/201607190049515cl5uxgpnp4280x180.jpg', detailUrl='http://m.51tietu.net/tp/42798.html'}
TieTuListBean{title='2016唯美带字图片伤感', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718224241cbltwqfjpjc280x180.jpg', detailUrl='http://m.51tietu.net/tp/42778.html'}
TieTuListBean{title='山林唯美风景清新意境美图', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160719001753xnzavw5h50l280x180.jpg', detailUrl='http://m.51tietu.net/tp/42767.html'}
TieTuListBean{title='繁华都市夜幕下唯美背景图', imgUrl='http://img2.51tietu.net/upload/thumb/20160927/20160718215745pyvuyjovtf3280x180.jpg', detailUrl='http://m.51tietu.net/tp/42755.html'}
```
###51贴图-根据类型查看图片详情
```
TieTuDetailBean{imgUrl='http://img2.51tietu.net/upload/www.51tietu.net/2016-061915/20160619151702oz4ylljf2fv39.jpg', desc='null'}
TieTuDetailBean{imgUrl='null', desc=''}
TieTuDetailBean{imgUrl='null', desc='文｜封寒紫'}
TieTuDetailBean{imgUrl='null', desc='01'}
TieTuDetailBean{imgUrl='null', desc='小鱼约我吃饭，席间，当我以一分钟一次的频率处理着手机上的消息时，小鱼一个人享受着餐桌上的美食，手机一直搁在桌角没看。想到最近大家常调侃的那句“有空一起出来玩手机啊”，我突然感觉有点不好意思。'}
TieTuDetailBean{imgUrl='null', desc='“小鱼…你都不看手机消息么？”'}
TieTuDetailBean{imgUrl='null', desc='“大忙人，我可不像你有那么多消息要处理。就算有消息，也没那么十万火急，吃完饭再看都没关系。”'}
TieTuDetailBean{imgUrl='null', desc='“你现在不是谈了恋爱么？你和你男友都不聊天么？”'}
TieTuDetailBean{imgUrl='null', desc='之所以这么问，是因为以前和小鱼聚在一起时，她有部分时间肯定是用来和男友通着电话或者发着消息的。'}
TieTuDetailBean{imgUrl='null', desc='“聊啊，但不会一直聊着。”小鱼突然笑起来，“亲爱的，你放心，我没有对这段感情心不在焉，相反的，我很认真地对待着现在这份感情。”'}
TieTuDetailBean{imgUrl='null', desc='02'}
TieTuDetailBean{imgUrl='null', desc='小鱼之前有过一段三年的恋情，在最美好的大学时光。'}
TieTuDetailBean{imgUrl='null', desc='小鱼和他前男友互相依赖且互相占有，两个人之间说得最多的话大概就是这些了：'}
TieTuDetailBean{imgUrl='null', desc='“你在忙什么，干嘛不接我电话？”'}
TieTuDetailBean{imgUrl='null', desc='“我都说我想你了你怎么不来找我？”'}
TieTuDetailBean{imgUrl='null', desc='“你竟然敢不回我消息？”'}
TieTuDetailBean{imgUrl='null', desc='“你到底爱不爱我？”'}
TieTuDetailBean{imgUrl='null', desc='……'}
TieTuDetailBean{imgUrl='null', desc='不成熟的恋爱里，总有缺乏安全感的说辞，然后用情感来捆绑对方的时间与空间，只有你在身边，我才拥有全世界。'}
TieTuDetailBean{imgUrl='null', desc='矫情做作是恋爱的通病，病入膏肓时，它会猜忌彼此的真心。'}
TieTuDetailBean{imgUrl='null', desc='终于有一天，彼此都忍无可忍，误解、争吵……也许还会经历一段相爱相杀又难舍难分的阶段，但免不了最后的分道扬镳。'}
TieTuDetailBean{imgUrl='null', desc='03'}
TieTuDetailBean{imgUrl='null', desc='小鱼现在的男友比她大七岁，小鱼喊他叔。'}
TieTuDetailBean{imgUrl='null', desc='小鱼说，“我和叔每天都有自己的工作要忙，我们每天都有联系，但不天天见面。叔平时很多应酬，但只要他想起我，主动联系我，我就在，有时候我也会主动联系叔，我们之间这种很自在的状态让我珍惜每一次和叔的见面。”'}
TieTuDetailBean{imgUrl='null', desc='小鱼还说，“很多时候我都在克制着自己内心想要表达的情感，我不去在乎这七年里有多少人站在叔的身边过，我也不去管叔的心里有没有藏着哪个故人，我不去瞎想，也不去跟叔瞎问。现在的我只想努力把自己变得更好一点，让自己更有资格站在叔的身边。”'}
TieTuDetailBean{imgUrl='null', desc='小鱼说这些话的时候，我能感觉出她对这位叔浓厚又不黏稠的爱意。我不知道说什么，只是突然想起了韩寒的电影《后会无期》里的一句台词：喜欢就放肆，爱才是克制。现在的小鱼，也许是遇到爱了吧。'}
TieTuDetailBean{imgUrl='null', desc='04'}
TieTuDetailBean{imgUrl='null', desc='很多人不能理解“爱才是克制”这个观念，我来讲讲之前看过的一个小故事吧。'}
TieTuDetailBean{imgUrl='null', desc='在一个大冬天，有一个男子在一家火锅店前快步地走来走去，边走边抖着大衣，像是要把身上的热气全部抖出来一样。火锅店里的店员看不下去了，跑出来问他大冷天的在干嘛，难不成是独特的锻炼身体的方法？'}
TieTuDetailBean{imgUrl='null', desc='男子很不好意思地回答，他是嗜辣如命的人，可是老婆不能吃辣，一吃就过敏，连闻到浑身都会起疹子，他就只好偶尔跟几个哥们儿出来偷偷打牙祭，刚刚那么做是想把身上的味道都散尽，以免回家时老婆闻到。'}
TieTuDetailBean{imgUrl='null', desc='店员很不解，“你这么能吃辣，却找了个不能吃辣的人过一辈子，不是要痛苦死吗？”'}
TieTuDetailBean{imgUrl='null', desc='可是男子回答，“因为我爱她啊，别说她对辣过敏，就算对盐过敏，对水过敏，对空气过敏……那都不是事儿！只要不对我过敏就行。”'}
TieTuDetailBean{imgUrl='null', desc='当时读完这个故事时，我沉默并思考了很久。我们总是觉得爱就是要表达心中的想法，可是克制而不说出的爱，其实更加难得可贵呀。'}
TieTuDetailBean{imgUrl='null', desc='很多人都在追《太阳的后裔》这部剧。剧中男二徐大荣的隐忍与女二尹明珠的坚持，他们之间那种克制的爱，真的触动了太多人的心。'}
TieTuDetailBean{imgUrl='null', desc='剧中有一个桥段，是在地震后，二人在乌鲁克重逢，尹明珠跑向徐大荣。'}
TieTuDetailBean{imgUrl='null', desc='他对她说“幸亏你没事，非常担心你”。'}
TieTuDetailBean{imgUrl='null', desc='她对他说“别受伤，这是命令，一定要保护好自己”。'}
TieTuDetailBean{imgUrl='null', desc='然后互敬军礼，开始了各自的救灾任务。'}
TieTuDetailBean{imgUrl='null', desc='后来在一次聊天中，尹明珠问：“如果我有事怎么办？”'}
TieTuDetailBean{imgUrl='null', desc='徐大荣说“那我会后悔，那些用来逃避你的日子。”'}
TieTuDetailBean{imgUrl='null', desc='说完两个人抱在一起，没再说一句多余煽情的表白。但就是这样一个拥抱，却可以感受出他们毫无保留又笨拙地爱着并守护着对方。'}
TieTuDetailBean{imgUrl='null', desc='05'}
TieTuDetailBean{imgUrl='null', desc='当你明明知道对方这会正在烦心着明天活动的策划案或者会议时需要讨论的内容时，你会依然要求和对方煲一碗长长的电话粥吗？'}
TieTuDetailBean{imgUrl='null', desc='“想那么多干什么呢，爱我才是最重要的大事呀！”'}
TieTuDetailBean{imgUrl='null', desc='“有我陪你呢，我们来聊聊其他有意思的事情吧！”'}
TieTuDetailBean{imgUrl='null', desc='可是对方这会就是很心烦，你感觉到他态度不是很好，尽管你自认为自己在努力安抚他，可你察觉出他在敷衍你，于是你开始心生怨气。'}
TieTuDetailBean{imgUrl='null', desc='“你到底把我当什么？我这么关心你你却不耐烦！”'}
TieTuDetailBean{imgUrl='null', desc='“你烦你可以跟我讲啊，你是不是根本就不爱我！”'}
TieTuDetailBean{imgUrl='null', desc='你以为你这是爱，其实这是狭隘的喜欢。'}
TieTuDetailBean{imgUrl='null', desc='如果你爱他，你会懂得他的心情，并克制住你此刻的感受，你只需要对他说四个字：“早点休息”，就很温暖。'}
TieTuDetailBean{imgUrl='null', desc='06'}
TieTuDetailBean{imgUrl='null', desc='我们都要在爱情里学会理解与换位思考，学会克制住很多不恰当的表达，学会不控制彼此并信任彼此，营造最自在的相处方式。'}
TieTuDetailBean{imgUrl='null', desc='清大词家朱彝尊写过这样的词：共眠一舸听秋雨，小簟轻衾各自寒。词中描述的便是与他深爱着但囿于现实而不能表达的女子，两人各眠一处却不在身边，天寒不能入睡，设想对方也还没有入眠吧？那就把深深的爱意，放在心中最秘密的地方。'}
TieTuDetailBean{imgUrl='null', desc='我想你，但不会闹着要见你。'}
TieTuDetailBean{imgUrl='null', desc='我不需要无时无刻地和你保持联系，但只要想起你时，你在就好。'}
TieTuDetailBean{imgUrl='null', desc='我们永远不会对彼此心生厌烦，因为我们都懂得，喜欢就放肆，爱才是克制。'}
TieTuDetailBean{imgUrl='null', desc='作者：封寒紫，在北方努力生长的南方姑娘，偶尔言情，偶尔鸡汤。微信公众号：有个酒馆 (ID:yougejiuguan)。本文由晚安少年（v_night）首发。'}
TieTuDetailBean{imgUrl='null', desc='唯美一句：用一分钟离开，用一辈子去忘记。'}
TieTuDetailBean{imgUrl='null', desc='唯美一句：或许所有人都没有发现她其实是恨的，又或许只是当做没有发现，毕竟她失去了所有。'}
```

如果对你有帮助，请star下吧，谢谢。
