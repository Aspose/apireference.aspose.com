---
title: "ImageSaveOptions"
second_title: "Aspose.Page for Java API リファレンス"
description: "このクラスは、変換プロセスの管理に必要なオプションを含んでいます。"
type: docs
weight: 10
url: /ja/java/com.aspose.eps.device/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class ImageSaveOptions extends SaveOptions
```

このクラスは、変換プロセスの管理に必要なオプションを含んでいます。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | ImageSaveOptions クラスの新しいインスタンスを初期化し、フラグ suppressErrors (true) と debug (false) のデフォルト値を設定します。 |
| [ImageSaveOptions(ImageFormat imageFormat)](#ImageSaveOptions-com.aspose.page.ImageFormat-) | 指定された画像形式で ImageSaveOptions の新しいインスタンスを初期化します。 |
| [ImageSaveOptions(Dimension size)](#ImageSaveOptions-java.awt.Dimension-) | 指定された画像サイズで ImageSaveOptions の新しいインスタンスを初期化します。 |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-) | 指定された画像サイズと画像形式で ImageSaveOptions の新しいインスタンスを初期化します。 |
| [ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-) | 指定された画像形式と suppressErrors フラグで ImageSaveOptions の新しいインスタンスを初期化します。 |
| [ImageSaveOptions(Dimension size, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-boolean-) | 指定された画像サイズと suppressErrors フラグで ImageSaveOptions の新しいインスタンスを初期化します。 |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-) | 指定された画像サイズ、画像形式、そして suppressErrors フラグで ImageSaveOptions の新しいインスタンスを初期化します。 |
| [ImageSaveOptions(boolean supressErrors)](#ImageSaveOptions-boolean-) | ImageSaveOptions クラスの新しいインスタンスを初期化し、フラグ debug (false) のデフォルト値を設定します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | コンバータが入力ドキュメントのフォントを検索すべき追加のフォントフォルダーを返します。 |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | 非 TrueType フォントを TTF に保存する必要があるかを示すフラグを取得します。 |
| [getExceptions()](#getExceptions--) | 致命的でないエラーのリストを返します。 |
| [getImageFormat()](#getImageFormat--) | 結果画像の画像形式を取得します。 |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 画像の圧縮レベルを指定する値を返します。 |
| [getResolution()](#getResolution--) | 結果画像の解像度を返します。 |
| [getSize()](#getSize--) | ページまたは画像のサイズを取得します。 |
| [getSmoothingMode()](#getSmoothingMode--) | スムージングモードを取得します。 |
| [getTryJoinImageFragments()](#getTryJoinImageFragments--) | ライブラリが画像フラグメントを結合しようとするかどうかを示します。 |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | 変換中の警告やメッセージの出力を許可するフラグを取得します。 |
| [isSupressErrors()](#isSupressErrors--) | 変換中にエラーが抑制されるかどうかを示す値を返します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | コンバータが入力ドキュメントのフォントを検索すべき追加のフォントフォルダーを指定します。 |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | 非 TrueType フォントを TTF に保存するかどうかを指定します。 |
| [setDebug(boolean debug)](#setDebug-boolean-) | 変換中の警告やメッセージの出力を許可するフラグを指定します。 |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | 結果画像の画像形式を指定します。 |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 画像の圧縮レベルを指定する値を設定します。 |
| [setResolution(float resolution)](#setResolution-float-) | 結果画像の解像度を指定します。 |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | ページまたは画像のサイズを指定します。 |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | スムージングモードを設定します。 |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | 変換中にエラーが抑制されるかどうかを示すフラグを指定します。 |
| [setTryJoinImageFragments(boolean tryJoinImageFragments)](#setTryJoinImageFragments-boolean-) | ライブラリが画像フラグメントの結合を試みるかどうかを指定します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


ImageSaveOptions クラスの新しいインスタンスを初期化し、フラグ suppressErrors (true) と debug (false) のデフォルト値を設定します。

### ImageSaveOptions(ImageFormat imageFormat) {#ImageSaveOptions-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(ImageFormat imageFormat)
```


指定された画像形式で ImageSaveOptions の新しいインスタンスを初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 画像の形式です。 |

### ImageSaveOptions(Dimension size) {#ImageSaveOptions-java.awt.Dimension-}
```
public ImageSaveOptions(Dimension size)
```


指定された画像サイズで ImageSaveOptions の新しいインスタンスを初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| size | java.awt.Dimension | 画像サイズ。 |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat)
```


指定された画像サイズと画像形式で ImageSaveOptions の新しいインスタンスを初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| size | java.awt.Dimension | 画像サイズ。 |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 画像の形式。 |

### ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)
```


指定された画像形式と suppressErrors フラグで ImageSaveOptions の新しいインスタンスを初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 画像の形式。 |
| supressErrors | boolean | true の場合、致命的でないエラーがあっても変換を続行します。 |

### ImageSaveOptions(Dimension size, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-boolean-}
```
public ImageSaveOptions(Dimension size, boolean supressErrors)
```


指定された画像サイズと suppressErrors フラグで ImageSaveOptions の新しいインスタンスを初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| size | java.awt.Dimension | 画像サイズ。 |
| supressErrors | boolean | true の場合、致命的でないエラーがあっても変換を続行します。 |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)
```


指定された画像サイズ、画像形式、そして suppressErrors フラグで ImageSaveOptions の新しいインスタンスを初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| size | java.awt.Dimension | 画像サイズ。 |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 画像の形式。 |
| supressErrors | boolean | true の場合、致命的でないエラーがあっても変換を続行します。 |

### ImageSaveOptions(boolean supressErrors) {#ImageSaveOptions-boolean-}
```
public ImageSaveOptions(boolean supressErrors)
```


ImageSaveOptions クラスの新しいインスタンスを初期化し、フラグ debug (false) のデフォルト値を設定します。

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
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


結果画像の画像形式を取得します。

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An output image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


画像の圧縮レベルを指定する値を返します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。

**Returns:**
int - 画像の圧縮レベルを指定する値。
### getResolution() {#getResolution--}
```
public float getResolution()
```


結果画像の解像度を返します。

**Returns:**
float - 画像の解像度。
### getSize() {#getSize--}
```
public Dimension getSize()
```


ページまたは画像のサイズを取得します。

**Returns:**
java.awt.Dimension - ページまたは画像のサイズです。
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


スムージングモードを取得します。

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - the smoothingMode.
### getTryJoinImageFragments() {#getTryJoinImageFragments--}
```
public boolean getTryJoinImageFragments()
```


ライブラリが画像フラグメントの結合を試みるかどうかを示します。これは、ソースの PS/EPS ファイル内の画像がフラグメントに分割されている場合に使用されます。このフラグがない場合、フラグメント間に細い隙間が残ります。

**Returns:**
boolean - フラグの値。
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

### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


結果画像の画像形式を指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 出力画像形式です。 |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


画像の圧縮レベルを指定する値を設定します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | int | 画像の圧縮レベルを指定する値。 |

### setResolution(float resolution) {#setResolution-float-}
```
public void setResolution(float resolution)
```


結果画像の解像度を指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 解像度 | float | 画像の解像度です。 |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


ページまたは画像のサイズを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| size | java.awt.Dimension | ページまたは画像のサイズです。 |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


スムージングモードを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | 設定する smoothingMode |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


変換中にエラーが抑制されるかどうかを示すフラグを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| supressErrors | boolean | ブール値です。 |

### setTryJoinImageFragments(boolean tryJoinImageFragments) {#setTryJoinImageFragments-boolean-}
```
public void setTryJoinImageFragments(boolean tryJoinImageFragments)
```


ライブラリが画像フラグメントの結合を試みるかどうかを指定します。これは、ソースの PS/EPS ファイル内の画像がフラグメントに分割されている場合に使用されます。このフラグがない場合、フラグメント間に細い隙間が残ります。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| tryJoinImageFragments | boolean | フラグの値。 |

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

