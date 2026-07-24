---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions クラス"
linktitle: "PdfSaveOptions"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions クラス。C++ での XPS を PDF として保存するオプション用クラスです。"
type: docs
weight: 300
url: /ja/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


XPS を PDF として保存するオプションのクラス。

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | ノード間で渡すページの一部のサイズを指定します。 |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | 保存直前に [XPS](../../aspose.page.xps/) ページに対して変更を行うイベントハンドラのコレクションです。 |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | 暗号化の詳細を取得します。設定されていない場合、暗号化は行われません。 |
| [get_ImageCompression](./get_imagecompression/)() const | ドキュメント内のすべての画像に使用される圧縮タイプを指定します。デフォルトは [PdfImageCompression::Auto](../pdfimagecompression/) です。 |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | PDF ファイルがビューアで開かれたときに、ドキュメントアウトラインをどのレベルまで展開するかを指定します。1 - 最初のレベルのアウトライン項目のみが表示され、2 - 最初と二番目のレベルの項目が表示される、というように続きます。デフォルトは 1 です。 |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | 保存するドキュメントアウトラインツリーの高さを指定します。0 - アウトラインツリーは変換されません、1 - 最初のレベルのアウトライン項目のみが変換されます、以下同様。デフォルトは 10 です。 |
| [get_PageNumbers](./get_pagenumbers/)() override | 変換するページ番号の配列を取得/設定します。 |
| [get_PreserveText](./get_preservetext/)() override | [XPS](../../aspose.page.xps/) では、フォント内の任意の文字コードに対応しない代替グリフ形への参照を含むテキスト要素が存在する場合があります。このフラグが true に設定されていると、該当する [XPS](../../aspose.page.xps/) 要素のテキストはグラフィックシェイプに変換され、テキスト自体は上に透明に表示されます。これにより、その要素のテキストは選択可能なままです。ただし、出力ファイルのサイズが元より大幅に大きくなる副作用があります。このフラグが false に設定されている場合、代替形として表示すべき文字は別の文字に置き換えられ、代替グリフ形にマッピングされます。その結果、テキストは選択可能ですが変更され、読めなくなる可能性があります。デフォルトは false です。 |
| [get_TextCompression](./get_textcompression/)() const | ドキュメントアウトラインのどのレベルで [ApsBookmark](../) オブジェクトを表示するかを指定します。0 - 表示しない、1 - 最初のレベルで表示、以下同様。デフォルトは 0 です。 |
| [PdfSaveOptions](./pdfsaveoptions/)() | オプションの新しいインスタンスを作成します。 |
| [set_BatchSize](./set_batchsize/)(int32_t) override | ノード間で渡すページの一部のサイズを指定します。 |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | 暗号化の詳細を設定します。設定されていない場合、暗号化は行われません。 |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | ドキュメント内のすべての画像に使用される圧縮タイプを指定します。デフォルトは [PdfImageCompression::Auto](../pdfimagecompression/) です。 |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | PDF ファイルがビューアで開かれたときに、ドキュメントアウトラインをどのレベルまで展開するかを指定します。1 - 最初のレベルのアウトライン項目のみが表示され、2 - 最初と二番目のレベルの項目が表示される、というように続きます。デフォルトは 1 です。 |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | 保存するドキュメントアウトラインツリーの高さを指定します。0 - アウトラインツリーは変換されません、1 - 最初のレベルのアウトライン項目のみが変換されます、以下同様。デフォルトは 10 です。 |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | 変換するページ番号の配列を取得/設定します。 |
| [set_PreserveText](./set_preservetext/)(bool) override | [XPS](../../aspose.page.xps/) では、フォント内の任意の文字コードに対応しない代替グリフ形への参照を含むテキスト要素が存在する場合があります。このフラグが true に設定されていると、該当する [XPS](../../aspose.page.xps/) 要素のテキストはグラフィックシェイプに変換され、テキスト自体は上に透明に表示されます。これにより、その要素のテキストは選択可能なままです。ただし、出力ファイルのサイズが元より大幅に大きくなる副作用があります。このフラグが false に設定されている場合、代替形として表示すべき文字は別の文字に置き換えられ、代替グリフ形にマッピングされます。その結果、テキストは選択可能ですが変更され、読めなくなる可能性があります。デフォルトは false です。 |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | ドキュメントアウトラインのどのレベルで [ApsBookmark](../) オブジェクトを表示するかを指定します。0 - 表示しない、1 - 最初のレベルで表示、以下同様。デフォルトは 0 です。 |
## 参照

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
