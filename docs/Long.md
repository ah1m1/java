# Long

### 1.1 Einen neuen Long erstellen
```java
    long a = 12;
```

### 1.2 Zahlenbereich des Longs
```java
    long a = Long.MAX_VALUE;
    // a = 9223372036854775807

    long b = Long.MIN_VALUE;
    // b = -9223372036854775808
```

> `Long.MAX_VALUE` gibt die maximale Größe eines Longs aus. `a + 1` würde eine Overflow Exception erzeugen.

> `Long.MIN_VALUE` gibt die minimale Größe eines Longs aus. `b - 1` würde eine Underflow Exception erzeugen.

### 1.3 Mit Longs rechnen
```java
    // Addition
    long a = 12;
    long b = 13;
    long c = a + b;
```

```java
    // Subtraktion
    long a = 12;
    long b = 13;
    long c = a - b;
```

```java
    // Multiplikation
    long a = 12;
    long b = 13;
    long c = a * b;
```

```java
    // Division
    long a = 12;
    long b = 13;
    long c = a / b;
```