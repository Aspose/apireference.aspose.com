---
title: "Aspose::Page::XPS::XpsDocument::CreateIccProfile メソッド"
linktitle: "CreateIccProfile"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreateIccProfile メソッド。C++ でストリームから新しい ICC プロファイル リソースを作成します。"
type: docs
weight: 1600
url: /ja/cpp/aspose.page.xps/xpsdocument/createiccprofile/
---
## XpsDocument::CreateIccProfile(System::SharedPtr\<System::IO::Stream\>) method


*stream* から新しい ICC プロファイルリソースを作成します。

```cpp
System::SharedPtr<XpsModel::XpsIccProfile> Aspose::Page::XPS::XpsDocument::CreateIccProfile(System::SharedPtr<System::IO::Stream> stream)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | System::SharedPtr\<System::IO::Stream\> | リソースとして使用する ICC プロファイルを含むストリームです。 |

### ReturnValue

新しい ICC プロファイル リソースです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Class [Stream](../../../system.io/stream/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateIccProfile(System::String) method


*iccProfilePath* にある ICC プロファイルファイルから新しい ICC プロファイルリソースを作成します。

```cpp
System::SharedPtr<XpsModel::XpsIccProfile> Aspose::Page::XPS::XpsDocument::CreateIccProfile(System::String iccProfilePath)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| iccProfilePath | System::String | リソースとして使用する ICC プロファイルへのパスです。 |

### ReturnValue

新しい ICC プロファイル リソースです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
