package unitTest;

import org.junit.Assert;
import org.junit.Test;
import utilsJson.JsonHelper;

public class JsonCompareTest {

    @Test
    public void compareJsonTest(){
        String actualResultJson="{\n" +
                "    \"Id\": 3896234,\n" +
                "    \"Content\": \"Eynar\",\n" +
                "    \"ItemsCount\": 0,\n" +
                "    \"Icon\": 4,\n" +
                "    \"ItemType\": 2,\n" +
                "    \"ParentId\": null,\n" +
                "    \"Collapsed\": false,\n" +
                "    \"ItemOrder\": 37,\n" +
                "    \"Children\": [],\n" +
                "    \"IsProjectShared\": false,\n" +
                "    \"ProjectShareOwnerName\": null,\n" +
                "    \"ProjectShareOwnerEmail\": null,\n" +
                "    \"IsShareApproved\": false,\n" +
                "    \"IsOwnProject\": true,\n" +
                "    \"LastSyncedDateTime\": \"/Date(1614685875393)/\",\n" +
                "    \"LastUpdatedDate\": \"/Date(1614685875377)/\",\n" +
                "    \"Deleted\": false,\n" +
                "    \"SyncClientCreationId\": null\n" +
                "}";
        String expectResultJson="{\n" +
                "    \"Id\": \"IGNORE\",\n" +
                "    \"Content\": \"Eynar\",\n" +
                "    \"ItemsCount\": 0,\n" +
                "    \"Icon\": 4,\n" +
                "    \"ItemType\": 2,\n" +
                "    \"ParentId\": null,\n" +
                "    \"Collapsed\": false,\n" +
                "    \"ItemOrder\": 37,\n" +
                "    \"Children\": [],\n" +
                "    \"IsProjectShared\": false,\n" +
                "    \"ProjectShareOwnerName\": null,\n" +
                "    \"ProjectShareOwnerEmail\": null,\n" +
                "    \"IsShareApproved\": false,\n" +
                "    \"IsOwnProject\": true,\n" +
                "    \"LastSyncedDateTime\": \"IGNORE\",\n" +
                "    \"LastUpdatedDate\": \"IGNORE\",\n" +
                "    \"Deleted\": false,\n" +
                "    \"SyncClientCreationId\": null\n" +
                "}";



        Assert.assertEquals("Error!",true, JsonHelper.areEqualJson(expectResultJson,actualResultJson));


    }


    @Test
    public void compareJsonTest2(){
        String actualResultJson="{\n" +
                "    \"Id\": 3896234,\n" +
                "    \"Content\": \"Eynar\",\n" +
                "    \"ItemsCount\": 0,\n" +
                "    \"Icon\": 4,\n" +
                "    \"ItemType\": 2,\n" +
                "    \"ParentId\": null,\n" +
                "    \"Collapsed\": false,\n" +
                "    \"ItemOrder\": 37,\n" +
                "    \"Children\": [],\n" +
                "    \"IsProjectShared\": false,\n" +
                "    \"ProjectShareOwnerName\": null,\n" +
                "    \"ProjectShareOwnerEmail\": null,\n" +
                "    \"IsShareApproved\": false,\n" +
                "    \"IsOwnProject\": true,\n" +
                "    \"LastSyncedDateTime\": \"/Date(1614685875393)/\",\n" +
                "    \"LastUpdatedDate\": \"/Date(1614685875377)/\",\n" +
                "    \"Deleted\": false,\n" +
                "    \"SyncClientCreationId\": null\n" +
                "}";
        String expectResultJson="{\n" +
                "    \"Id\": \"IGNORE\",\n" +
                "    \"ParentId\": null,\n" +
                "    \"Content\": \"UPB\",\n" +
                "    \"ItemsCount\": 0,\n" +
                "    \"Icon\": 4,\n" +
                "    \"ItemType\": 2,\n" +
                "    \"Collapsed\": true,\n" +
                "    \"ItemOrder\": 37,\n" +
                "    \"Children\": [],\n" +
                "    \"IsProjectShared\": false,\n" +
                "    \"ProjectShareOwnerName\": null,\n" +
                "    \"ProjectShareOwnerEmail\": null,\n" +
                "    \"IsShareApproved\": false,\n" +
                "    \"IsOwnProject\": true,\n" +
                "    \"LastSyncedDateTime\": \"IGNORE\",\n" +
                "    \"LastUpdatedDate\": \"IGNORE\",\n" +
                "    \"Deleted\": false,\n" +
                "    \"SyncClientCreationId\": null\n" +
                "}";



        Assert.assertEquals("Error!",false, JsonHelper.areEqualJson(expectResultJson,actualResultJson));


    }

}
