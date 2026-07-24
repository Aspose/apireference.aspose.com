---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateColor méthode"
linktitle: "CreateColor"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateColor méthode. Crée une nouvelle couleur dans l'espace colorimétrique scRGB en C++."
type: docs
weight: 800
url: /fr/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createcolor/
---
## PageAPI::CreateColor(float, float, float, float) method


Crée une nouvelle couleur dans l'espace colorimétrique scRGB.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateColor(float a, float r, float g, float b)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| a | float | Le composant alpha de la couleur. |
| r | float | Le composant de couleur rouge. |
| g | float | Le composant de couleur verte. |
| b | float | Le composant de couleur bleue. |

### ReturnValue

Nouvelle couleur.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateColor(float, float, float) method


Crée une nouvelle couleur dans l'espace colorimétrique scRGB.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateColor(float r, float g, float b)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| r | float | Le composant de couleur rouge. |
| g | float | Le composant de couleur verte. |
| b | float | Le composant de couleur bleue. |

### ReturnValue

Nouvelle couleur.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateColor(int32_t, int32_t, int32_t, int32_t) method


Crée une nouvelle couleur dans l'espace colorimétrique sRGB.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateColor(int32_t a, int32_t r, int32_t g, int32_t b)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| a | int32_t | Le composant alpha de la couleur. |
| r | int32_t | Le composant de couleur rouge. |
| g | int32_t | Le composant de couleur verte. |
| b | int32_t | Le composant de couleur bleue. |

### ReturnValue

Nouvelle couleur.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateColor(int32_t, int32_t, int32_t) method


Crée une nouvelle couleur dans l'espace colorimétrique sRGB.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateColor(int32_t r, int32_t g, int32_t b)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| r | int32_t | Le composant de couleur rouge. |
| g | int32_t | Le composant de couleur verte. |
| b | int32_t | Le composant de couleur bleue. |

### ReturnValue

Nouvelle couleur.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateColor(System::Drawing::Color) method


Crée une nouvelle couleur.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateColor(System::Drawing::Color color)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| couleur | System::Drawing::Color | Une instance de couleur native pour la couleur RVB. |

### ReturnValue

Nouvelle couleur.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [Color](../../../system.drawing/color/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateColor(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) method


Crée une nouvelle couleur dans un espace colorimétrique basé sur ICC.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateColor(System::SharedPtr<XpsModel::XpsIccProfile> iccProfile, const System::ArrayPtr<float> &components)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| iccProfile | System::SharedPtr\<XpsModel::XpsIccProfile\> | La ressource de profil ICC. |
| composants | const System::ArrayPtr\<float\>\& | Composants de couleur. |

### ReturnValue

Nouvelle couleur.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateColor(System::String, const System::ArrayPtr\<float\>\&) method


Crée une nouvelle couleur dans un espace colorimétrique basé sur ICC.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateColor(System::String path, const System::ArrayPtr<float> &components)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | System::String | Le chemin vers le profil ICC. |
| composants | const System::ArrayPtr\<float\>\& | Composants de couleur. |

### ReturnValue

Nouvelle couleur.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
