# androidAppFramework
Aim to do a simple framework for android developer.

android app层开发框架，主要目的简化开发者繁琐的重复性的开发过程，进而把大把的经历放到业务逻辑处理上。
主要使用了以下第三方jar：（感谢开源提供者，向你们致敬）
  1：loonAndroid 主要对XML布局进行IOC反转控制，通过注解的方式绑定view 和 事件。
  2：eventBus  发布与订阅事件 取代 handler
  3：ormlite 封装，使得使用更接近对象关系，让你感觉不到sql的存在。
  4：spring mvc 使用了spring的mvc框架使得业务，数据库，UI，更加清晰分明。
  5：android-async-http 完成通用的网络请求。
  
  
  
  1:添加数据库:
 UserDao dao = new UserDao(User.class);
 User user = new User();
 user.setName("blackcrystaling");
 dao.add(user);
 
  2:获取数据库信息:
  UserDao dao = new UserDao(User.class);
  Toast.makeText(this,"User:"+dao.getList().size(),Toast.LENGTH_SHORT).show();

  
  
