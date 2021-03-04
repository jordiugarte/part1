package factoryRequest;

public class FactoryRequest {

    public static final String GET="get";
    public static final String PUT="put";
    public static final String POST="post";
    public static final String DELETE="delete";
    public static final String PATCH="patch";

    public static IRequest make(String type){
          IRequest request;
          switch (type.toLowerCase()){
              case GET:
                  request= new Get();
                  break;
              case DELETE:
                  request= new Delete();
                  break;
              case PUT:
                  request= new Put();
                  break;
              case POST:
                  request= new Post();
                  break;
              case PATCH:
                  request= new Patch();
                  break;
              default:
                  request= new Get();
                  break;

          }

          return  request;
      }

}
