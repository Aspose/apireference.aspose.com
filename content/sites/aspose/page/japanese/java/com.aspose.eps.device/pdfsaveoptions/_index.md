---
title: "PdfSaveOptions"
second_title: "Aspose.Page for Java API リファレンス"
description: "このクラスは、変換プロセスの管理に必要なオプションを含んでいます。"
type: docs
weight: 11
url: /ja/java/com.aspose.eps.device/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PdfSaveOptions extends SaveOptions
```

このクラスは、変換プロセスの管理に必要なオプションを含んでいます。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | PdfSaveOptions クラスの新しいインスタンスを初期化し、フラグ suppressErrors (true) と debug (false) のデフォルト値を設定します。 |
| [PdfSaveOptions(boolean supressErrors)](#PdfSaveOptions-boolean-) | PdfSaveOptions クラスの新しいインスタンスを初期化し、フラグ debug (false) のデフォルト値を設定します。 |
| [PdfSaveOptions(Dimension size)](#PdfSaveOptions-java.awt.Dimension-) | PdfSaveOptions クラスの新しいインスタンスを初期化し、ページサイズを設定します。 |
| [PdfSaveOptions(boolean supressErrors, Dimension size)](#PdfSaveOptions-boolean-java.awt.Dimension-) | PdfSaveOptions クラスの新しいインスタンスを初期化し、フラグ debug (false) のデフォルト値とページサイズを設定します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | コンバータが入力ドキュメントのフォントを検索すべき追加のフォントフォルダーを返します。 |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | 非 TrueType フォントを TTF に保存する必要があるかを示すフラグを取得します。 |
| [getExceptions()](#getExceptions--) | 致命的でないエラーのリストを返します。 |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 画像の圧縮レベルを指定する値を返します。 |
| [getSize()](#getSize--) | ページまたは画像のサイズを取得します。 |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | 変換中の警告やメッセージの出力を許可するフラグを取得します。 |
| [isSupressErrors()](#isSupressErrors--) | 変換中にエラーが抑制されるかどうかを示す値を返します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | コンバータが入力ドキュメントのフォントを検索すべき追加のフォントフォルダーを指定します。 |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | 非 TrueType フォントを TTF に保存するかどうかを指定します。 |
| [setDebug(boolean debug)](#setDebug-boolean-) | 変換中の警告やメッセージの出力を許可するフラグを指定します。 |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 画像の圧縮レベルを指定する値を設定します。 |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | ページまたは画像のサイズを指定します。 |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | 変換中にエラーが抑制されるかどうかを示すフラグを指定します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


PdfSaveOptions クラスの新しいインスタンスを初期化し、フラグ suppressErrors (true) と debug (false) のデフォルト値を設定します。

### PdfSaveOptions(boolean supressErrors) {#PdfSaveOptions-boolean-}
```
public PdfSaveOptions(boolean supressErrors)
```


PdfSaveOptions クラスの新しいインスタンスを初期化し、フラグ debug (false) のデフォルト値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| supressErrors | boolean | true の場合、致命的でないエラーがあっても変換を続行します。 |

### PdfSaveOptions(Dimension size) {#PdfSaveOptions-java.awt.Dimension-}
```
public PdfSaveOptions(Dimension size)
```


PdfSaveOptions クラスの新しいインスタンスを初期化し、ページサイズを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| size | java.awt.Dimension | ページのサイズです。 |

### PdfSaveOptions(boolean supressErrors, Dimension size) {#PdfSaveOptions-boolean-java.awt.Dimension-}
```
public PdfSaveOptions(boolean supressErrors, Dimension size)
```


PdfSaveOptions クラスの新しいインスタンスを初期化し、フラグ debug (false) のデフォルト値とページサイズを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| supressErrors | boolean | true の場合、致命的でないエラーがあっても変換を続行します。 |
| size | java.awt.Dimension | ページのサイズです。 |

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


コンバータが入力ドキュメントのフォントを検索すべき追加のフォントフォルダーを返します。デフォルトのフォルダーは、OS が内部で使用するフォントを検索する標準フォントフォルダーです。

**Returns:**
java.lang.String[] - フォントフォルダーの配列。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


非 TrueType フォントを TTF に保存する必要があるかを示すフラグを取得します。

**Returns:**
boolean - フラグの値。
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


致命的でないエラーのリストを返します。

**Returns:**
java.util.List<java.lang.Exception> - 例外リスト
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


画像の圧縮レベルを指定する値を返します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。

**Returns:**
int - 画像の圧縮レベルを指定する値。
### getSize() {#getSize--}
```
public Dimension getSize()
```


ページまたは画像のサイズを取得します。

**Returns:**
java.awt.Dimension - ページまたは画像のサイズです。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


変換中の警告やメッセージの出力を許可するフラグを取得します。

**Returns:**
boolean - デバッグ値。
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


変換中にエラーが抑制されるかどうかを示す値を返します。

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




### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


コンバータが入力ドキュメントのフォントを検索すべき追加のフォントフォルダーを指定します。デフォルトのフォルダーは、OS が内部で使用するフォントを検索する標準フォントフォルダーです。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | フォントフォルダーの配列です。 |

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


非TrueTypeフォントをTTFに保存するかどうかを指定します。これにより、PSからPDFへの変換時の生成ドキュメントの容量が大幅に減少し、非TrueTypeフォントで大量のテキストを含むPSファイルを任意の出力形式に変換する速度が向上します。ただし、PostScriptファイルを画像に変換する際にテキストがわずかに垂直方向にずれることがあります。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | boolean | フラグの値です。 |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


変換中の警告やメッセージの出力を許可するフラグを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| debug | boolean | ブール値です。 |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


画像の圧縮レベルを指定する値を設定します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | int | 画像の圧縮レベルを指定する値。 |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


ページまたは画像のサイズを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| size | java.awt.Dimension | ページまたは画像のサイズです。 |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


変換中にエラーが抑制されるかどうかを示すフラグを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| supressErrors | boolean | ブール値です。 |

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

