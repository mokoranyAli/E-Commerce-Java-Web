package dao;

import model.User;


public interface UserDAO {
	
	public void addUser(User user);
	
	public boolean checkUser(String userName);
	
	public boolean login(String userName, String userPassword);
        
        public boolean Register(User u);
	
	public void updateUser(User user);
	
	public User getUser(String userName);

}
