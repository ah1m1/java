# Integer

### 1.1 Einen neuen Integer erstellen
```java
    int a = 12;
```

### 1.2 Zahlenbereich des Integers
```java
    int a = Integer.MAX_VALUE;
    // a = 2147483647

    int b = Integer.MIN_VALUE;
    // b = -2147483648
```

> `Integer.MAX_VALUE` gibt die maximale Größe eines Integers aus. `a + 1` würde eine Overflow Exception erzeugen.

> `Integer.MIN_VALUE` gibt die minimale Größe eines Integers aus. `b - 1` würde eine Underflow Exception erzeugen.

### 1.3 Mit Integern rechnen
```java
    // Addition
    int a = 12;
    int b = 13;
    int c = a + b;
```

```java
    // Subtraktion
    int a = 12;
    int b = 13;
    int c = a - b;
```

```java
    // Multiplikation
    int a = 12;
    int b = 13;
    int c = a * b;
```

```java
    // Division
    int a = 12;
    int b = 13;
    int c = a / b;
```