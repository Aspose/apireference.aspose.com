---
title: "Aspose::Page::EPS::PsDocument::Save メソッド"
linktitle: "保存"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::Save メソッド。指定された PsDocument を PS または EPS ファイルとして保存します。このメソッドは、PsDocument が C++ で最初から作成された場合にのみ使用されます。"
type: docs
weight: 4200
url: /ja/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


指定された [PsDocument](../) を PS または [EPS](../../) ファイルとして保存します。このメソッドは、[PsDocument](../) が最初から作成された場合にのみ使用されます。

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## 参照

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


指定された [PsDocument](../) をストリームに保存します。このメソッドは、[XMP](../../../aspose.page.eps.xmp/) メタデータを更新した後にのみ使用されます。更新された既存のメタデータ、または GetMetadata メソッドの呼び出し時に作成された新しいメタデータを含む初期の [EPS](../../) ファイルを保存します。最後の場合、必要なすべての PostScript コードと [EPS](../../) コメントが追加されます。

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | 出力 [EPS](../../) ファイルのストリーム。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


指定された [PsDocument](../) を [EPS](../../) ファイルとして保存します。このメソッドは、[XMP](../../../aspose.page.eps.xmp/) メタデータを更新した後にのみ使用されます。更新された既存のメタデータ、または GetMetadata メソッドの呼び出し時に作成された新しいメタデータを含む初期の [EPS](../../) ファイルを保存します。最後の場合、必要なすべての PostScript コードと [EPS](../../) コメントが追加されます。

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| outEpsFilePath | System::String | 出力 [EPS](../../) ファイルのパス。 |

## 参照

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
