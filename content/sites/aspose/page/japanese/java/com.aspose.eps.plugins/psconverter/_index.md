---
title: "PsConverter"
second_title: "Aspose.Page for Java API リファレンス"
description: "PsConverter プラグインを表します。"
type: docs
weight: 10
url: /ja/java/com.aspose.eps.plugins/psconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class PsConverter implements IPlugin
```

PsConverter プラグインを表します。

この例は、PS/EPS ファイルを PDF ドキュメントに変換する方法を示しています。

// PsConverter を作成 PsConverter converter = new PsConverter(); // 出力データタイプをファイルに設定する PsConverterToPdfOptions オブジェクトを作成 PsConverterToPdfOptions opt = new PsConverterToPdfOptions(); // 入力ファイルパスを追加 opt.addDataSource(new FileDataSource(inputPath)); // 出力ファイルパスを設定 opt.addSaveDataSource(new FileDataSource(outputPath)); // 変換プロセスを開始 ResultContainer results = converter.process(opt);

この例は、PS/EPS ファイルを画像に変換し、ファイルとして出力する方法を示しています。

// PsConverter を作成 PsConverter converter = new PsConverter(); // JPEG ターゲット画像フォーマットで PsConverterToImageOptions を作成します。結果画像のデフォルトフォーマットは PNG です。 // また、結果画像のサイズ、解像度、スムージングモード、JPEG 画像フォーマットの品質レベルを設定できます。 PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // 入力ファイルパスを追加 opt.addDataSource(new FileDataSource(inputPath)); // 入力 PS ファイルが複数ページの場合、結果は次の名前形式の画像ファイル集合になります: [\"outputPath\" の拡張子なし][ページ番号（0 から開始）].[\"outputPath\" の拡張子] opt.addSaveDataSource(new FileDataSource(outputPath)); // 変換プロセスを開始 converter.process(opt);

この例は、PS/EPS ファイルを画像に変換し、バイト配列として出力する方法を示しています。

バイト配列出力データソース (byte [][]) では、1 つのバイト配列が 1 ページの画像を含みます。そのため、1 ページ文書の場合、結果は [1][] 配列となり、複数ページ文書の場合、結果は [入力 PS 文書のページ数][] 配列となります。 // PsConverter を作成 PsConverter converter = new PsConverter(); // JPEG ターゲット画像フォーマットで PsConverterToImageOptions を作成します。結果画像のデフォルトフォーマットは PNG です。 // また、結果画像のサイズ、解像度、スムージングモード、JPEG 画像フォーマットの品質レベルを設定できます。 PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageImageFormat.Jpeg); // 入力ファイルパスを追加 opt.addDataSource(new FileDataSource(inputPath)); // 入力 PS ファイルが複数ページの場合、結果は次の名前形式の画像ファイル集合になります: [\"outputPath\" の拡張子なし][ページ番号（0 から開始）].[\"outputPath\" の拡張子] opt.addSaveDataSource(new ByteArrayDataSource()); // 変換プロセスを開始 converter.process(opt); // 結果のバイト配列を取得 byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [PsConverter()](#PsConverter--) |  |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [dispose()](#dispose--) | IDisposable の実装。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | 指定されたパラメータで PsConverter の処理を開始します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverter() {#PsConverter--}
```
public PsConverter()
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


指定されたパラメータで PsConverter の処理を開始します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | PsConverter 用の指示を含むオプションオブジェクトです。 |

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

