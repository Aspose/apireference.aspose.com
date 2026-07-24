---
title: "Aspose::Page::XPS::XpsDocument::CreateIccProfile méthode"
linktitle: "CreateIccProfile"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsDocument::CreateIccProfile method. Crée une nouvelle ressource de profil ICC à partir d'un flux en C++."
type: docs
weight: 1600
url: /fr/cpp/aspose.page.xps/xpsdocument/createiccprofile/
---
## XpsDocument::CreateIccProfile(System::SharedPtr\<System::IO::Stream\>) method


Crée une nouvelle ressource de profil ICC à partir de *stream*.

```cpp
System::SharedPtr<XpsModel::XpsIccProfile> Aspose::Page::XPS::XpsDocument::CreateIccProfile(System::SharedPtr<System::IO::Stream> stream)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | System::SharedPtr\<System::IO::Stream\> | Le flux contenant le profil ICC à prendre comme ressource. |

### ReturnValue

Nouvelle ressource de profil ICC.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Class [Stream](../../../system.io/stream/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateIccProfile(System::String) method


Crée une nouvelle ressource de profil ICC à partir du fichier de profil ICC situé à *iccProfilePath*.

```cpp
System::SharedPtr<XpsModel::XpsIccProfile> Aspose::Page::XPS::XpsDocument::CreateIccProfile(System::String iccProfilePath)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| iccProfilePath | System::String | Le chemin vers le profil ICC à prendre comme ressource. |

### ReturnValue

Nouvelle ressource de profil ICC.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
