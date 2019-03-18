package com.restep.item01;

/**
 * @author restep
 * @date 2019/3/18
 */
public class ProviderTest {
    public static void main(String[] args) {
        Services.registerDefaultProvider(defaultProvider);
        Services.registerProvider("comp", comProvider);
        Services.registerProvider("armed", armedProvider);

        Service s1 = Services.newInstance();
        Service s2 = Services.newInstance("comp");
        Service s3 = Services.newInstance("armed");
        System.out.printf("%s, %s, %s%n", s1, s2, s3);
    }

    private static Provider defaultProvider = new Provider() {
        @Override
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Default Service";
                }
            };
        }
    };

    private static Provider comProvider = new Provider() {
        @Override
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Complementary Service";
                }
            };
        }
    };

    private static Provider armedProvider = new Provider() {
        @Override
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Armed Service";
                }
            };
        }
    };
}
