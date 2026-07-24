---
title: "XpsConverterToPdfOptions"
second_title: "Aspose.Page for Java API リファレンス"
description: "プラグインの XPS から PDF へのコンバータオプションを表します。"
type: docs
weight: 13
url: /ja/java/com.aspose.xps.plugins/xpsconvertertopdfoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToPdfOptions extends XpsConverterOptions
```

プラグイン [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) の XPS から PDF へのコンバータオプションを表します。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [XpsConverterToPdfOptions()](#XpsConverterToPdfOptions--) | 新しい [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions) オブジェクトのインスタンスを初期化します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | XpsConverter プラグインのデータコレクションに新しいデータ ソースを追加します。 |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | XpsConverterOptions プラグインのデータコレクションに新しいデータ ソースを追加します。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | XpsConverterOptions プラグインのデータコレクションを返します。 |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 画像の圧縮レベルを指定する値を返します。 |
| [getOperationName()](#getOperationName--) | 操作名を返します。 |
| [getPageNumbers()](#getPageNumbers--) | 変換する XPS ドキュメントのページ番号の配列を取得します。 |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | 保存操作結果のために追加されたターゲットのコレクションを取得します。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 画像の圧縮レベルを指定する値を設定します。 |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | 変換する XPS ドキュメントのページ数の配列を設定します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToPdfOptions() {#XpsConverterToPdfOptions--}
```
public XpsConverterToPdfOptions()
```


新しい [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions) オブジェクトのインスタンスを初期化します。

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


XpsConverter プラグインのデータコレクションに新しいデータ ソースを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | 追加するデータ ソース。 |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


XpsConverterOptions プラグインのデータコレクションに新しいデータ ソースを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | 保存操作結果のためのデータ ソース（ファイルまたはストリーム）。 |

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
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


XpsConverterOptions プラグインのデータコレクションを返します。

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


画像の圧縮レベルを指定する値を返します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。

**Returns:**
int - 画像の圧縮レベルを指定する値。
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


操作名を返します。

**Returns:**
java.lang.String
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


変換する XPS ドキュメントのページ番号の配列を取得します。

**Returns:**
int[] - XPS ドキュメントのページ数の配列。
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


保存操作結果のために追加されたターゲットのコレクションを取得します。

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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




### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


画像の圧縮レベルを指定する値を設定します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | int | 画像の圧縮レベルを指定する値。 |

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


変換する XPS ドキュメントのページ数の配列を設定します。設定しない場合、すべてのページが変換されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| pageNumbers | int[] | XPS ドキュメントのページ数の配列。 |

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

