---
title: "従量課金"
second_title: "Aspose.Page for Java API リファレンス"
description: "メーターキーを設定するためのメソッドを提供します。"
type: docs
weight: 15
url: /ja/java/com.aspose.page/metered/
---
**Inheritance:**
java.lang.Object
```
public final class Metered
```

メーターキーを設定するためのメソッドを提供します。

--------------------

この例では、従量課金の公開キーと秘密キーを設定しようとします。

```
The component jar file:
  
 	Metered matered = new Metered();
 	matered.setMeteredKey("PublicKey", "PrivateKey");
```
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [Metered()](#Metered--) | このクラスの新しいインスタンスを初期化します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [clearMeteredLicense()](#clearMeteredLicense--) | 従量課金ライセンスをクリアします。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [flush()](#flush--) | サーバー上のカウントデータをフラッシュします。 |
| [getClass()](#getClass--) |  |
| [getConsumptionCredit()](#getConsumptionCredit--) | 消費クレジットを取得します。 |
| [getConsumptionQuantity()](#getConsumptionQuantity--) | 消費ファイルサイズを取得します |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMeteredKey(String publicKey, String privateKey)](#setMeteredKey-java.lang.String-java.lang.String-) | メーター付きの公開キーと秘密キーを設定します |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Metered() {#Metered--}
```
public Metered()
```


このクラスの新しいインスタンスを初期化します。

### clearMeteredLicense() {#clearMeteredLicense--}
```
public static void clearMeteredLicense()
```


従量課金ライセンスをクリアします。

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### flush() {#flush--}
```
public static void flush()
```


サーバー上のカウントデータをフラッシュします。デバッグ目的でのみ使用されます。

### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConsumptionCredit() {#getConsumptionCredit--}
```
public static double getConsumptionCredit()
```


消費クレジットを取得します。

**Returns:**
double - 消費量
### getConsumptionQuantity() {#getConsumptionQuantity--}
```
public static double getConsumptionQuantity()
```


消費ファイルサイズを取得します

**Returns:**
double - 消費量
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setMeteredKey(String publicKey, String privateKey) {#setMeteredKey-java.lang.String-java.lang.String-}
```
public void setMeteredKey(String publicKey, String privateKey)
```


メーター付きの公開キーと秘密キーを設定します

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| publicKey | java.lang.String | 公開キー |
| privateKey | java.lang.String | 秘密キー |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

