---
title: "JpegSaveOptions"
second_title: "Aspose.Page for Java API リファレンス"
description: "XPS を JPEG として保存するオプションのクラス。"
type: docs
weight: 12
url: /ja/java/com.aspose.xps.rendering/jpegsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions), [com.aspose.xps.rendering.ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions)
```
public class JpegSaveOptions extends ImageSaveOptions
```

XPS を JPEG として保存するオプションのクラス。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [JpegSaveOptions()](#JpegSaveOptions--) | 新しいオプションのインスタンスを作成します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | コンバータが入力ドキュメントのフォントを検索すべき追加のフォントフォルダーを返します。 |
| [getBatchSize()](#getBatchSize--) | ノードからノードへ渡すページの一部のサイズを返します。 |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | 保存直前に XPS ページに対して変更を行うイベントハンドラのコレクションを返します。 |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | 非 TrueType フォントを TTF に保存する必要があるかを示すフラグを取得します。 |
| [getExceptions()](#getExceptions--) | 致命的でないエラーのリストを返します。 |
| [getImageSize()](#getImageSize--) | 出力画像のサイズ（ピクセル単位）を取得します。 |
| [getInterpolationMode()](#getInterpolationMode--) | 補間モードを取得します。 |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 画像の圧縮レベルを指定する値を返します。 |
| [getPageNumbers()](#getPageNumbers--) | レンダリングするページ数の配列を取得します。 |
| [getResolution()](#getResolution--) | 画像の解像度を取得します。 |
| [getSize()](#getSize--) | ページまたは画像のサイズを取得します。 |
| [getSmoothingMode()](#getSmoothingMode--) | スムージングモードを取得します。 |
| [getTextRenderingHint()](#getTextRenderingHint--) | テキストレンダリングヒントを取得します。 |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | 変換中の警告やメッセージの出力を許可するフラグを取得します。 |
| [isSupressErrors()](#isSupressErrors--) | 変換中にエラーが抑制されるかどうかを示す値を返します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | コンバータが入力ドキュメントのフォントを検索すべき追加のフォントフォルダーを指定します。 |
| [setBatchSize(int value)](#setBatchSize-int-) | ノードからノードへ渡すページの一部のサイズを設定します。 |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | 非 TrueType フォントを TTF に保存するかどうかを指定します。 |
| [setDebug(boolean debug)](#setDebug-boolean-) | 変換中の警告やメッセージの出力を許可するフラグを指定します。 |
| [setImageSize(Dimension value)](#setImageSize-java.awt.Dimension-) | 出力画像のサイズ（ピクセル単位）を設定します。 |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-) | 補間モードを設定します。 |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 画像の圧縮レベルを指定する値を設定します。 |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | レンダリングするページ数の配列を設定します。 |
| [setResolution(float value)](#setResolution-float-) | 画像の解像度を設定します。 |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | ページまたは画像のサイズを指定します。 |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | スムージングモードを設定します。 |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | 変換中にエラーが抑制されるかどうかを示すフラグを指定します。 |
| [setTextRenderingHint(TextRenderingHint value)](#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-) | テキストレンダリングヒントを設定します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### JpegSaveOptions() {#JpegSaveOptions--}
```
public JpegSaveOptions()
```


新しいオプションのインスタンスを作成します。

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
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


ノードからノードへ渡すページの一部のサイズを返します。

**Returns:**
int - ノードからノードへ渡すページの一部のサイズ。
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


保存直前に XPS ページに対して変更を行うイベントハンドラのコレクションを返します。

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler>
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
### getImageSize() {#getImageSize--}
```
public Dimension getImageSize()
```


出力画像のサイズ（ピクセル単位）を取得します。

**Returns:**
java.awt.Dimension - 出力画像のサイズ（ピクセル単位）。
### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


補間モードを取得します。

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) - The interpolation mode.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


画像の圧縮レベルを指定する値を返します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。

**Returns:**
int - 画像の圧縮レベルを指定する値。
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


レンダリングするページ数の配列を取得します。

**Returns:**
int[] - ページ数。
### getResolution() {#getResolution--}
```
public float getResolution()
```


画像の解像度を取得します。

**Returns:**
float - 画像解像度。
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
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - The smoothing mode.
### getTextRenderingHint() {#getTextRenderingHint--}
```
public TextRenderingHint getTextRenderingHint()
```


テキストレンダリングヒントを取得します。

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) - The text rendering hint.
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

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


ノードからノードへ渡すページの一部のサイズを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | int | ノード間で渡すページの一部のサイズです。 |

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

### setImageSize(Dimension value) {#setImageSize-java.awt.Dimension-}
```
public void setImageSize(Dimension value)
```


出力画像のサイズ（ピクセル単位）を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | java.awt.Dimension | 出力画像のサイズ（ピクセル単位）です。 |

### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


補間モードを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) | 補間モードです。 |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


画像の圧縮レベルを指定する値を設定します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | int | 画像の圧縮レベルを指定する値。 |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


レンダリングするページ数の配列を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | int[] | ページ数です。 |

### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


画像の解像度を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | 画像の解像度です。 |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


ページまたは画像のサイズを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| size | java.awt.Dimension | ページまたは画像のサイズです。 |

### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


スムージングモードを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | スムージングモードです。 |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


変換中にエラーが抑制されるかどうかを示すフラグを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| supressErrors | boolean | ブール値です。 |

### setTextRenderingHint(TextRenderingHint value) {#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-}
```
public void setTextRenderingHint(TextRenderingHint value)
```


テキストレンダリングヒントを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) | テキスト描画ヒントです。 |

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

