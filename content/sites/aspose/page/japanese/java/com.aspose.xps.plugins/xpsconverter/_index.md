---
title: "XpsConverter"
second_title: "Aspose.Page for Java API リファレンス"
description: "XpsConverter プラグインを表します。"
type: docs
weight: 10
url: /ja/java/com.aspose.xps.plugins/xpsconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class XpsConverter implements IPlugin
```

XpsConverter プラグインを表します。

この例は、XPS ドキュメントを PDF ドキュメントに変換する方法を示しています。

// XpsConverter を作成 XpsConverter converter = new XpsConverter(); // XpsConverterToPdfOptions オブジェクトを作成し、出力データタイプをファイルに設定 XpsConverterToPdfOptions opt = new XpsConverterToPdfOptions(); // 入力ファイルパスを追加 opt.addDataSource(new FileDataSource(inputPath)); // 出力ファイルパスを設定 opt.addSaveDataSource(new FileDataSource(outputPath)); // 変換プロセスを開始 ResultContainer results = converter.process(opt);

この例は、XPS ドキュメントをファイル出力の画像に変換する方法を示しています。

// XpsConverter を作成 XpsConverter converter = new XpsConverter(); // JPEG ターゲット画像形式で XpsConverterToImageOptions を作成します。結果画像のデフォルト形式は PNG です。 // また、結果画像のサイズ、解像度、スムージングモード、JPEG 形式の画像品質レベルを設定できます。 XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // 入力ファイルパスを追加 opt.addDataSource(new FileDataSource(inputPath)); // 入力 XPS ファイルが複数ページの場合、結果は次の名前形式の画像ファイルのセットになります: [\"outputPath\" の拡張子なし][ページ番号は 0 から開始].[\"outputPath\" の拡張子] opt.addSaveDataSource(new FileDataSource(outputPath)); // 変換プロセスを開始 converter.process(opt);

この例は、XPS ドキュメントをバイト配列出力の画像に変換する方法を示しています。

バイト配列出力データソース (byte[][]) では、1 つのバイト配列が 1 ページの画像を含みます。そのため、1 ページ文書の場合、結果は [1][] 配列となり、複数ページ文書の場合、結果は [入力 XPS ドキュメントのページ数][] 配列となります。 // XpsConverter を作成 XpsConverter converter = new XpsConverter(); // JPEG ターゲット画像形式で XpsConverterToImageOptions を作成します。結果画像のデフォルト形式は PNG です。 // また、結果画像のサイズ、解像度、スムージングモード、JPEG 形式の画像品質レベルを設定できます。 XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // 入力ファイルパスを追加 opt.addDataSource(new FileDataSource(inputPath)); // 入力 XPS ファイルが複数ページの場合、結果は次の名前形式の画像ファイルのセットになります: [\"outputPath\" の拡張子なし][ページ番号は 1 から開始].[\"outputPath\" の拡張子] opt.addSaveDataSource(new ByteArrayDataSource()); // 変換プロセスを開始 converter.process(opt); // 結果のバイト配列を取得 byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [XpsConverter()](#XpsConverter--) |  |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [dispose()](#dispose--) | IDisposable の実装。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | 指定されたパラメータで XpsConverter の処理を開始します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverter() {#XpsConverter--}
```
public XpsConverter()
```


### dispose() {#dispose--}
```
public final void dispose()
```


IDisposable の実装。

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
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### process(IPluginOptions options) {#process-com.aspose.page.plugins.IPluginOptions-}
```
public final ResultContainer process(IPluginOptions options)
```


指定されたパラメータで XpsConverter の処理を開始します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | XpsConverter の指示を含むオプション オブジェクトです。 |

**Returns:**
[ResultContainer](../../com.aspose.page.plugins/resultcontainer) - An ResultContainer object containing the result of the operation.
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

