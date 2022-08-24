package API.pojo.esen;

public enum URI {
    USERS("/users"),
    USERSISONLINE("/isuseronline"),
    USERBYUSERNAME("/username:"),
    DELETEUSER("/deleteuser");




    public final String endPoint;
    URI( String endPoint) {
        this.endPoint = endPoint;
    }



}
