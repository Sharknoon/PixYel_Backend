/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pods_backend;

/**
 *
 * @author Josua Frank
 */
public class Test {

    private String privateKey = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDHL2XxUAp/EgY36zI2dwtKP7P7hNX9ENxx+egqskS0hdybRtSRTcCO31WUAczOnJZgDlVPg6eyXk9t7lRXp6cXA+oJBRBUglTPHyAGyd3e3DPDopuExttxcqy1dW5e93eHpXMfgKEDpojaDurC/sKhKBTDrXj1F5NfPMq3h4PxTTL/xZuf2ezZGhtqQY1gpsdXcYH+MkHQLm4v9WPmIyKueqHaZROGkc1mf4kbYKoeG0Osl4hIMBk3xsEJhX8kQ+CjsTNFqNnqEpQdJ7U9tJHLp/1b87u3KJNyAH+er0HHGRnOdz1YiW3ALIKWd6yic/o4eUiuXQlmpGcDISfQJ4hxAgMBAAECggEAXCOE2LfZ4yYHUl6t/5vZ0SLesv6jrkjacK7VwspsFcXGYt3E/uIkrPKKt8iNYRX2ScDXncydClmuDIAu681V8cORw1JgV3dim90eB4Xh6HGcUGcr4aPLZxNQ6S/FOpDm7gyO0IfD89hZfeVgm4sVpU7RLCNWzKl3Npr8eyFo23m1d7JZDG9aoU0rYzmNCqlGiefaPsgFESQOv9nwEl8x7ElSziPHb3e9F+PGe4uWg4VSlCPpsWHx3kDs2vDgXOJ2TrqMctkNcsbBC//2kqKYdowBQHYmdeZJpb1llCsG96y4JQt0zoJfXJSiMewOPcGdUrRkGnGJhIRVAZy7BA5k8QKBgQDsWmxXT39WM/QktLiSqRC5TnHlHc3x4sHWo+nkrH4S1x4wi2/v7Sa1DJ2z2nadDcnzoIpTgRZNXdMDNj/GDSa2rQeAzUFSJR379r0iSkUXObbKAFw9yXo0UDHQu7mY/mquemGaAiQToRbECoH6oDKDoIRySz9mEL/W3Mt72MNCCwKBgQDXvgqpA9glwUlj+eSU8ZAIRB9uEohJXWMinCanntk2QC3e/Re/a+Sn4AFlHixoEWZfRLWSXUdeV8idd6/S+5hbgU/9rl5F1kgYCthlmXnbKgncI+XMH38niLOqt/1M4tyPlzQw6pW9TRcJyBCUtVhwlBdeQBMZiiGNbl4TuW6I8wKBgHferE/ju7smgk4TcgC/ygGRbWY8JXTmAlUvsLIPYamAfIk2TsEqT5VHHrxWsg2ZLrFm3IDZWUxHp3tbiiCSDu5a9xE2CEj3FivxyZ6YeE39MV1lrWKQym+5tGoeq1SSw9xVqSaIq29hJcCra5yGntfvEv08eJz1JbZ9KJ5ZIz5dAoGAfXb+uhYLQMGsjaDJJzloWvZLFPdgHNJbkcgfzsFZbuxaAOFNSzxSyLJD/WtTxd3AnEzYD1uB4sLIX5M4REme7DBCtbQPDSw11w2PlV5w+Fz1SPnzbQcwKmycl/7SJ0GTpUn4xy3VkTZg3IZl5iWkXiwxftVihirHonl56pyfRLMCgYAORrIGgPqzEGpHxGYkYK+xks6B5AoQJKwV7FQv/knRYciRB6Irg22778EorWUS+PPzjHwqBHTdk96NpAuU6Qa3a4w/Y5oXpD7l7u0jBYWRRt9fsVQUp/ULHS5Tnj0OdQATwG4T6uuRnKAVBb7kRC50GQXah96/o10SMEG//QdJWA==";

    public static void main(String[] args) throws XML.XMLException {
        String[] keyPair = Encryption.generateKeyPair();
        System.out.println("Public Key: " + keyPair[0]);
        System.out.println("Private Key: " + keyPair[1]);
    }
}
