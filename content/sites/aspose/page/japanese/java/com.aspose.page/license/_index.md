---
title: "ライセンス"
second_title: "Aspose.Page for Java API リファレンス"
description: "コンポーネントをライセンスするためのメソッドを提供します。"
type: docs
weight: 14
url: /ja/java/com.aspose.page/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

コンポーネントをライセンスするためのメソッドを提供します。

この例では、コンポーネントが含まれるフォルダー、呼び出しアセンブリが含まれるフォルダー、エントリアセンブリのフォルダー、そして呼び出しアセンブリの埋め込みリソース内で、MyLicense.lic という名前のライセンスファイルを探す試みが行われます。

License license = new License();
license.setLicense("MyLicense.lic");
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [License()](#License--) | このクラスの新しいインスタンスを初期化します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [isInternalFIPSSecurity()](#isInternalFIPSSecurity--) | デフォルトでは、デフォルトの JDK セキュリティを使用しています。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setInternalFIPSSecurity(boolean internalFIPSSecurity)](#setInternalFIPSSecurity-boolean-) | デフォルトでは、デフォルトの JRE セキュリティを使用しています。 |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | コンポーネントにライセンスを付与します。 |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | コンポーネントにライセンスを付与します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


このクラスの新しいインスタンスを初期化します。

この例では、コンポーネントが含まれるフォルダー、呼び出しアセンブリが含まれるフォルダー、エントリアセンブリのフォルダー、そして呼び出しアセンブリの埋め込みリソース内で、MyLicense.lic という名前のライセンスファイルを探す試みが行われます。

License license = new License();
license.setLicense("MyLicense.lic");

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isInternalFIPSSecurity() {#isInternalFIPSSecurity--}
```
public static boolean isInternalFIPSSecurity()
```


デフォルトでは、デフォルトの JDK セキュリティを使用しています。デフォルト値は false です。カスタマイズされた Java 環境が必要なアルゴリズムをサポートできない場合があり、その際は内部組み込みの FIPS セキュリティの使用を推奨します。

**Returns:**
boolean - 真偽値
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setInternalFIPSSecurity(boolean internalFIPSSecurity) {#setInternalFIPSSecurity-boolean-}
```
public static void setInternalFIPSSecurity(boolean internalFIPSSecurity)
```


デフォルトでは、デフォルトの JRE セキュリティを使用しています。デフォルト値は false です。カスタマイズされた Java 環境が必要なアルゴリズムをサポートできない場合があり、その際は内部組み込みの FIPS セキュリティの使用を推奨します。

また注意してください：JVM SecureRandom アルゴリズムによると、いくつかのオペレーティングシステムでは /dev/random がホストマシンで \u201cnoise\u201d が一定量生成されるまで結果を返さずに待機します。Oracle\u2019s JVM での乱数生成に使用されるライブラリは、UNIX プラットフォームではデフォルトで /dev/random に依存しています。/dev/random はより安全ですが、デフォルトの JVM 設定で遅延が発生する場合は /dev/urandom の使用が推奨されます。または /dev/random 用にエントロピーを生成するデバイスを追加してください。

以下の Java オプションは遅延を回避し、securerandom.source 設定を上書きするのに役立ちます。 -Djava.security.egd=file:/dev/./urandom

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| internalFIPSSecurity | boolean | boolean 値 |

### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public void setLicense(InputStream stream)
```


コンポーネントにライセンスを付与します。

ライセンスを含むストリームです。

このメソッドを使用して、ストリームからライセンスをロードします。

License license = new License();
license.setLicense(myStream);

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| ストリーム | java.io.InputStream | license ストリーム |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


コンポーネントにライセンスを付与します。

ライセンスを次の場所で検索します：

1. 明示的なパス。

2. コンポーネント JAR ファイルのフォルダー。

この例では、コンポーネントが含まれるフォルダー、呼び出しアセンブリが含まれるフォルダー、エントリアセンブリのフォルダー、そして呼び出しアセンブリの埋め込みリソース内で、MyLicense.lic という名前のライセンスファイルを探す試みが行われます。

License license = new License();
license.setLicense("MyLicense.lic");

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| licenseName | java.lang.String | 完全または短いファイル名、または埋め込みリソースの名前を指定できます。空文字列を使用すると評価モードに切り替わります。 |

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

