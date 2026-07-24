---
title: "PsSaveOptions"
second_title: "Aspose.Page for Java API リファレンス"
description: "このクラスは、変換プロセスの管理に必要なオプションを含んでいます。"
type: docs
weight: 12
url: /ja/java/com.aspose.eps.device/pssaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PsSaveOptions extends SaveOptions
```

このクラスは、変換プロセスの管理に必要なオプションを含んでいます。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [PsSaveOptions()](#PsSaveOptions--) | PdfSaveOptions クラスの新しいインスタンスを初期化し、フラグ suppressErrors (true) と debug (false) のデフォルト値を設定します。 |
| [PsSaveOptions(boolean supressErrors)](#PsSaveOptions-boolean-) | PdfSaveOptions クラスの新しいインスタンスを初期化し、フラグ debug (false) のデフォルト値を設定します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | コンバータが入力ドキュメントのフォントを検索すべき追加のフォントフォルダーを返します。 |
| [getBackgroundColor()](#getBackgroundColor--) |  |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | 非 TrueType フォントを TTF に保存する必要があるかを示すフラグを取得します。 |
| [getEmbedFontsAs()](#getEmbedFontsAs--) |  |
| [getExceptions()](#getExceptions--) | 致命的でないエラーのリストを返します。 |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 画像の圧縮レベルを指定する値を返します。 |
| [getMargins()](#getMargins--) |  |
| [getPageSize()](#getPageSize--) |  |
| [getSaveFormat()](#getSaveFormat--) |  |
| [getSize()](#getSize--) | ページまたは画像のサイズを取得します。 |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | 変換中の警告やメッセージの出力を許可するフラグを取得します。 |
| [isEmbedFonts()](#isEmbedFonts--) | PS ドキュメントに使用されたフォントを埋め込むかどうかを示します |
| [isSupressErrors()](#isSupressErrors--) | 変換中にエラーが抑制されるかどうかを示す値を返します。 |
| [isTransparent()](#isTransparent--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | コンバータが入力ドキュメントのフォントを検索すべき追加のフォントフォルダーを指定します。 |
| [setBackgroundColor(Color backgroundColor)](#setBackgroundColor-java.awt.Color-) |  |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | 非 TrueType フォントを TTF に保存するかどうかを指定します。 |
| [setDebug(boolean debug)](#setDebug-boolean-) | 変換中の警告やメッセージの出力を許可するフラグを指定します。 |
| [setEmbedFonts(boolean embedFonts)](#setEmbedFonts-boolean-) | PS ドキュメントに使用されたフォントを埋め込むかどうかを指定します |
| [setEmbedFontsAs(String embedFontsAs)](#setEmbedFontsAs-java.lang.String-) | PS ドキュメントにフォントを埋め込むフォントタイプを指定します |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 画像の圧縮レベルを指定する値を設定します。 |
| [setMargins(Insets margins)](#setMargins-java.awt.Insets-) |  |
| [setPageSize(Dimension pageSize)](#setPageSize-java.awt.Dimension-) |  |
| [setSaveFormat(PsSaveFormat saveFormat)](#setSaveFormat-com.aspose.eps.device.PsSaveFormat-) | 結果ファイルの保存形式を指定します |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | ページまたは画像のサイズを指定します。 |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | 変換中にエラーが抑制されるかどうかを示すフラグを指定します。 |
| [setTransparent(boolean transparent)](#setTransparent-boolean-) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsSaveOptions() {#PsSaveOptions--}
```
public PsSaveOptions()
```


PdfSaveOptions クラスの新しいインスタンスを初期化し、フラグ suppressErrors (true) と debug (false) のデフォルト値を設定します。

### PsSaveOptions(boolean supressErrors) {#PsSaveOptions-boolean-}
```
public PsSaveOptions(boolean supressErrors)
```


PdfSaveOptions クラスの新しいインスタンスを初期化し、フラグ debug (false) のデフォルト値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| supressErrors | boolean | true の場合、致命的でないエラーがあっても変換を続行します。 |

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
### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```




**Returns:**
java.awt.Color - 背景色
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
### getEmbedFontsAs() {#getEmbedFontsAs--}
```
public String getEmbedFontsAs()
```




**Returns:**
java.lang.String - PS ドキュメントにフォントを埋め込むフォントのタイプ
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
### getMargins() {#getMargins--}
```
public Insets getMargins()
```




**Returns:**
java.awt.Insets - ページの余白
### getPageSize() {#getPageSize--}
```
public Dimension getPageSize()
```




**Returns:**
java.awt.Dimension - ページのサイズ
### getSaveFormat() {#getSaveFormat--}
```
public PsSaveFormat getSaveFormat()
```




**Returns:**
[PsSaveFormat](../../com.aspose.eps.device/pssaveformat) - save format of resulting file
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
### isEmbedFonts() {#isEmbedFonts--}
```
public boolean isEmbedFonts()
```


PS ドキュメントに使用されたフォントを埋め込むかどうかを示します

**Returns:**
boolean - embedFonts フラグの値
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


変換中にエラーが抑制されるかどうかを示す値を返します。

**Returns:**
boolean - 真偽値
### isTransparent() {#isTransparent--}
```
public boolean isTransparent()
```




**Returns:**
boolean - 背景が透明かどうかを示します
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

### setBackgroundColor(Color backgroundColor) {#setBackgroundColor-java.awt.Color-}
```
public void setBackgroundColor(Color backgroundColor)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| backgroundColor | java.awt.Color | 背景色を指定します |

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

### setEmbedFonts(boolean embedFonts) {#setEmbedFonts-boolean-}
```
public void setEmbedFonts(boolean embedFonts)
```


PS ドキュメントに使用されたフォントを埋め込むかどうかを指定します

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| embedFonts | boolean | embedFonts フラグ |

### setEmbedFontsAs(String embedFontsAs) {#setEmbedFontsAs-java.lang.String-}
```
public void setEmbedFontsAs(String embedFontsAs)
```


PS ドキュメントにフォントを埋め込むフォントタイプを指定します

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| embedFontsAs | java.lang.String | フォントタイプ |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


画像の圧縮レベルを指定する値を設定します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | int | 画像の圧縮レベルを指定する値。 |

### setMargins(Insets margins) {#setMargins-java.awt.Insets-}
```
public void setMargins(Insets margins)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 余白 | java.awt.Insets | ページの余白を指定します |

### setPageSize(Dimension pageSize) {#setPageSize-java.awt.Dimension-}
```
public void setPageSize(Dimension pageSize)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| pageSize | java.awt.Dimension | ページのサイズを指定します |

### setSaveFormat(PsSaveFormat saveFormat) {#setSaveFormat-com.aspose.eps.device.PsSaveFormat-}
```
public void setSaveFormat(PsSaveFormat saveFormat)
```


結果ファイルの保存形式を指定します

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| saveFormat | [PsSaveFormat](../../com.aspose.eps.device/pssaveformat) | 結果ファイルの形式 |

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

### setTransparent(boolean transparent) {#setTransparent-boolean-}
```
public void setTransparent(boolean transparent)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 透明 | boolean | 背景が透明かどうかを指定します |

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

