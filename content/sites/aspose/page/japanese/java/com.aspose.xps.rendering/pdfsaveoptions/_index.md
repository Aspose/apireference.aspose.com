---
title: "PdfSaveOptions"
second_title: "Aspose.Page for Java API リファレンス"
description: "XPS を PDF として保存するオプションのクラス。"
type: docs
weight: 14
url: /ja/java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

XPS を PDF として保存するオプションのクラス。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | 新しいオプションのインスタンスを作成します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | コンバータが入力ドキュメントのフォントを検索すべき追加のフォントフォルダーを返します。 |
| [getBatchSize()](#getBatchSize--) | ノードからノードへ渡すページの一部のサイズを返します。 |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | 保存直前に XPS ページに対して変更を行うイベントハンドラのコレクションを返します。 |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | 非 TrueType フォントを TTF に保存する必要があるかを示すフラグを取得します。 |
| [getEncryptionDetails()](#getEncryptionDetails--) | 暗号化の詳細を返します。 |
| [getExceptions()](#getExceptions--) | 致命的でないエラーのリストを返します。 |
| [getImageCompression()](#getImageCompression--) | ドキュメント内のすべての画像に使用される圧縮タイプを返します。 |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 画像の圧縮レベルを指定する値を返します。 |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | PDF ファイルがビューアで開かれたときに、ドキュメントアウトラインを展開するレベルを取得します。1 - 最初のレベルのアウトライン項目のみが表示され、2 - 最初と二番目のレベルのアウトライン項目が表示され、以下同様です。 |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | 保存するドキュメントアウトラインツリーの高さを取得します。0 - アウトラインツリーは変換されず、1 - 最初のレベルのアウトライン項目のみが変換され、以下同様です。 |
| [getPageNumbers()](#getPageNumbers--) | レンダリングするページ数の配列を取得します。 |
| [getSize()](#getSize--) | ページまたは画像のサイズを取得します。 |
| [getTextCompression()](#getTextCompression--) | 画像以外のすべてのコンテンツストリームに使用される圧縮タイプを返します。 |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | 変換中の警告やメッセージの出力を許可するフラグを取得します。 |
| [isSupressErrors()](#isSupressErrors--) | 変換中にエラーが抑制されるかどうかを示す値を返します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | XPS では、いくつかのテキスト要素がフォント内の文字コードに対応しない代替グリフ形への参照を含む場合があります。 |
| [preserveText(boolean value)](#preserveText-boolean-) | XPS では、いくつかのテキスト要素がフォント内の文字コードに対応しない代替グリフ形への参照を含む場合があります。 |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | コンバータが入力ドキュメントのフォントを検索すべき追加のフォントフォルダーを指定します。 |
| [setBatchSize(int value)](#setBatchSize-int-) | ノードからノードへ渡すページの一部のサイズを設定します。 |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | 非 TrueType フォントを TTF に保存するかどうかを指定します。 |
| [setDebug(boolean debug)](#setDebug-boolean-) | 変換中の警告やメッセージの出力を許可するフラグを指定します。 |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | 暗号化の詳細を設定します。 |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | ドキュメント内のすべての画像に使用される圧縮タイプを設定します。 |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 画像の圧縮レベルを指定する値を設定します。 |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | PDF ファイルがビューアで開かれたときに、ドキュメントアウトラインを展開するレベルを設定します。1 - 最初のレベルのアウトライン項目のみが表示され、2 - 最初と二番目のレベルのアウトライン項目が表示され、以下同様です。 |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | 保存するドキュメントアウトラインツリーの高さを設定します。0 - アウトラインツリーは変換されず、1 - 最初のレベルのアウトライン項目のみが変換され、以下同様です。 |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | レンダリングするページ数の配列を設定します。 |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | ページまたは画像のサイズを指定します。 |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | 変換中にエラーが抑制されるかどうかを示すフラグを指定します。 |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | 画像以外のすべてのコンテンツストリームに使用される圧縮タイプを設定します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
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
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - 保存直前に XPS ページに変更を加えるイベントハンドラのコレクションです。
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
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


暗号化の詳細を返します。設定されていない場合、暗号化は行われません。

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


致命的でないエラーのリストを返します。

**Returns:**
java.util.List<java.lang.Exception> - 例外リスト
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


ドキュメント内のすべての画像に使用される圧縮タイプを返します。デフォルトは PdfImageCompression.Auto です。

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


画像の圧縮レベルを指定する値を返します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。

**Returns:**
int - 画像の圧縮レベルを指定する値。
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


PDF ファイルがビューアで開かれたときに、ドキュメントアウトラインを展開するレベルを取得します。1 - 最初のレベルのアウトライン項目のみが表示され、2 - 最初と二番目のレベルのアウトライン項目が表示され、以下同様です。

**Returns:**
int - アウトラインツリーの展開レベル。
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


保存するドキュメントのアウトラインツリーの高さを取得します。0 - アウトラインツリーは変換されません、1 - 最初のレベルのアウトライン項目のみが変換され、以下同様です。デフォルトは 10 です。

**Returns:**
int - アウトラインツリーの高さ。
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


レンダリングするページ数の配列を取得します。

**Returns:**
int[] - ページ数。
### getSize() {#getSize--}
```
public Dimension getSize()
```


ページまたは画像のサイズを取得します。

**Returns:**
java.awt.Dimension - ページまたは画像のサイズです。
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


画像以外のすべてのコンテンツストリームに使用される圧縮タイプを返します。デフォルトは PdfTextCompression.Flate です。

**Returns:**
[PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) - The compression type.
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




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


XPS では、一部のテキスト要素がフォントの文字コードに対応しない代替グリフ形への参照を含むことがあります。このフラグが true に設定されている場合、該当する XPS 要素のテキストはグラフィックシェイプに変換され、テキスト自体は上に透明に表示されます。これにより、その要素のテキストは選択可能なまま残りますが、出力ファイルが元のファイルよりはるかに大きくなるという副作用があります。このフラグが false に設定されている場合、代替形として表示すべき文字は別の文字に置き換えられ、代替グリフ形にマッピングされます。したがって、テキストは依然として選択可能ですが、変更されて読めなくなる可能性があります。

**Returns:**
boolean - フラグの値。
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


XPS では、一部のテキスト要素がフォントの文字コードに対応しない代替グリフ形への参照を含むことがあります。このフラグが true に設定されている場合、該当する XPS 要素のテキストはグラフィックシェイプに変換され、テキスト自体は上に透明に表示されます。これにより、その要素のテキストは選択可能なまま残りますが、出力ファイルが元のファイルよりはるかに大きくなるという副作用があります。このフラグが false に設定されている場合、代替形として表示すべき文字は別の文字に置き換えられ、代替グリフ形にマッピングされます。したがって、テキストは依然として選択可能ですが、変更されて読めなくなる可能性があります。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | boolean | フラグの値です。 |

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

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


暗号化の詳細を設定します。設定されていない場合、暗号化は実行されません。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | 暗号化の詳細。 |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


ドキュメント内のすべての画像に使用される圧縮タイプを設定します。デフォルトは PdfImageCompression.Auto です。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | 圧縮タイプ。 |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


画像の圧縮レベルを指定する値を設定します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | int | 画像の圧縮レベルを指定する値。 |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


PDF ファイルがビューアで開かれたときに、ドキュメントアウトラインを展開するレベルを設定します。1 - 最初のレベルのアウトライン項目のみが表示され、2 - 最初と二番目のレベルのアウトライン項目が表示され、以下同様です。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | int | アウトラインツリーの展開レベル。 |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


保存するドキュメントアウトラインツリーの高さを設定します。0 - アウトラインツリーは変換されず、1 - 最初のレベルのアウトライン項目のみが変換され、以下同様です。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | int | アウトラインツリーの高さ。 |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


レンダリングするページ数の配列を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | int[] | ページ数です。 |

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

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


画像以外のすべてのコンテンツストリームに使用される圧縮タイプを設定します。デフォルトは PdfTextCompression.Flate です。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | 圧縮タイプ。 |

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

