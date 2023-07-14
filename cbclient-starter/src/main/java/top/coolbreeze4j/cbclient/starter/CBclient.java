package top.coolbreeze4j.cbclient.starter;

/**
 * @author CoolBreeze
 * @date 2023/7/14 10:12.
 */
public class CBclient {
    private String address;
    private Integer port;
    private String password;
    private Integer index;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "CBclient{" +
                "address='" + address + '\'' +
                ", port=" + port +
                ", password='" + password + '\'' +
                ", index=" + index +
                '}';
    }
}
