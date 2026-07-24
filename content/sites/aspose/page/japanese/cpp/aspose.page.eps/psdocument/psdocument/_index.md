---
title: "Aspose::Page::EPS::PsDocument::PsDocument コンストラクタ"
linktitle: "PsDocument"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::PsDocument コンストラクタ。空の PsDocument を初期化します。このコンストラクタは、PostScript ファイルに関係しない追加操作、例えば C++ でのフォント変換のためにのみ使用されます。"
type: docs
weight: 100
url: /ja/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


空の [PsDocument](../) を初期化します。このコンストラクタは、PostScript ファイルに関係しない追加操作、例えばフォントの変換のためにのみ使用されます。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## 参照

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


[PsDocument](../) を PS/EPS ファイルのストリームで初期化します。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | PS/EPS ファイルの入力ストリームです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


初期化されたページを持つ空の [PsDocument](../) を初期化します。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | PS/EPS ファイルを保存するストリーム。 |
| options | System::SharedPtr\<Device::PsSaveOptions\> | PostScript ファイルの保存を制御するパラメータのセット。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


空の [PsDocument](../) を初期化します。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | PS/EPS ファイルを保存するストリーム。 |
| options | System::SharedPtr\<Device::PsSaveOptions\> | PostScript ファイルの保存を制御するパラメータのセット。 |
| マルチページ | bool | false の場合、ページは初期化されません。この場合、ページの初期化は明示的な "openPage(width, height)" 呼び出しで実行する必要があります。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


ページ数が事前に分かっている場合、空の [PsDocument](../) を初期化します。[Postscript](../../../aspose.page.eps.postscript/) ドキュメントのページ数が既知です。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | PS/EPS ファイルを保存するストリーム。 |
| options | System::SharedPtr\<Device::PsSaveOptions\> | PostScript ファイルの保存を制御するパラメータのセット。 |
| numberOfPages | int32_t | PostScript ドキュメントのページ数です。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


初期化されたページを持つ空の [PsDocument](../) を初期化します。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| outPsFilePath | System::String | 出力 PS/EPS ファイルのパスです。 |
| options | System::SharedPtr\<Device::PsSaveOptions\> | PostScript ファイルの保存を制御するパラメータのセット。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


空の [PsDocument](../) を初期化します。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| outPsFilePath | System::String | 出力 PS/EPS ファイルのパスです。 |
| options | System::SharedPtr\<Device::PsSaveOptions\> | PostScript ファイルの保存を制御するパラメータのセット。 |
| マルチページ | bool | false の場合、ページは初期化されません。この場合、ページの初期化は明示的な "openPage(width, height)" 呼び出しで実行する必要があります。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


ページ数が事前に分かっている場合、空の [PsDocument](../) を初期化します。[Postscript](../../../aspose.page.eps.postscript/) ドキュメントのページ数が既知です。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| outPsFilePath | System::String | 出力 PS/EPS ファイルのパスです。 |
| options | System::SharedPtr\<Device::PsSaveOptions\> | PostScript ファイルの保存を制御するパラメータのセット。 |
| numberOfPages | int32_t | PostScript ドキュメントのページ数です。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


[PsDocument](../) を入力 PS/EPS ファイルで初期化します。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| psFilePath | System::String | PS/EPS ファイルのパスです。 |

## 参照

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
