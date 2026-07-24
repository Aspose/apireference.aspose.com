---
title: "Aspose::Page::SaveOptions クラス"
linktitle: "SaveOptions"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::SaveOptions クラス。 このクラスは C++ における変換プロセスの管理に必要なオプションを含みます。"
type: docs
weight: 1500
url: /ja/cpp/aspose.page/saveoptions/
---
## SaveOptions class


このクラスは変換プロセスの管理に必要なオプションを含みます。

```cpp
class SaveOptions : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | コンバータが入力ドキュメントのフォントを検索する追加フォルダーを指定します。デフォルトフォルダーは、OS が内部で使用するフォントを見つける標準フォントフォルダーです。 |
| virtual [get_ConvertFontsToTTF](./get_convertfontstottf/)() | TrueType でないフォントを TTF に保存するかどうかを指定します。これにより、PS から PDF への変換時に生成される文書のサイズが大幅に減少し、TrueType でないフォントが大量に含まれる PS ファイルを任意の出力形式に変換する速度が向上します。ただし、PostScript ファイルを画像に変換する際にテキストがわずかに垂直方向にずれることがあります。 |
| virtual [get_Debug](./get_debug/)() | デバッグ情報を標準出力ストリームに出力するかどうかを指定します。 |
| virtual [get_Exceptions](./get_exceptions/)() | [SuppressErrors](../) が true の場合、抑制された変換エラーのリストを返します。 |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Quality カテゴリは画像の圧縮レベルを指定します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。 |
| [get_Size](./get_size/)() const | 画像のサイズを取得/設定します。 |
| virtual [get_SupressErrors](./get_supresserrors/)() | エラーを抑制するかどうかを指定します。true の場合、抑制されたエラーは [Exceptions](../) リストに追加されます。false の場合、最初のエラーでプログラムが終了します。 |
| [SaveOptions](./saveoptions/)() | デフォルトでフラグ [SuppressErrors](../) を true、[Debug](../) を false に設定した [SaveOptions](./) クラスの新しいインスタンスを初期化します。 |
| [SaveOptions](./saveoptions/)(bool) | フラグ [Debug](../) を false に設定した [SaveOptions](./) クラスの新しいインスタンスを初期化します。 |
| [SaveOptions](./saveoptions/)(Aspose::Page::Drawing::Size) | ページサイズを指定した [SaveOptions](./) の新しいインスタンスを初期化します。 |
| [SaveOptions](./saveoptions/)(bool, Aspose::Page::Drawing::Size) | フラグ [Debug](../) を false に設定し、ページサイズを指定した [SaveOptions](./) クラスの新しいインスタンスを初期化します。 |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | コンバータが入力ドキュメントのフォントを検索する追加フォルダーを指定します。デフォルトフォルダーは、OS が内部で使用するフォントを見つける標準フォントフォルダーです。 |
| virtual [set_ConvertFontsToTTF](./set_convertfontstottf/)(bool) | TrueType でないフォントを TTF に保存するかどうかを指定します。これにより、PS から PDF への変換時に生成される文書のサイズが大幅に減少し、TrueType でないフォントが大量に含まれる PS ファイルを任意の出力形式に変換する速度が向上します。ただし、PostScript ファイルを画像に変換する際にテキストがわずかに垂直方向にずれることがあります。 |
| virtual [set_Debug](./set_debug/)(bool) | デバッグ情報を標準出力ストリームに出力するかどうかを指定します。 |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Quality カテゴリは画像の圧縮レベルを指定します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。 |
| [set_Size](./set_size/)(Aspose::Page::Drawing::Size) | 画像のサイズを取得/設定します。 |
| virtual [set_SupressErrors](./set_supresserrors/)(bool) | エラーを抑制するかどうかを指定します。true の場合、抑制されたエラーは [Exceptions](../) リストに追加されます。false の場合、最初のエラーでプログラムが終了します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
