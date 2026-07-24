---
title: "Aspose::Page::XPS::XpsDocument::CreateColor method"
linktitle: "CreateColor"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreateColor メソッド。C++ で scRGB カラースペースに新しいカラーを作成します。"
type: docs
weight: 1200
url: /ja/cpp/aspose.page.xps/xpsdocument/createcolor/
---
## XpsDocument::CreateColor(float, float, float, float) method


scRGB カラースペースで新しい色を作成します。

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(float a, float r, float g, float b)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| a | 単精度浮動小数点数 | アルファ色成分。 |
| r | 単精度浮動小数点数 | 赤色コンポーネント。 |
| g | 単精度浮動小数点数 | 緑色コンポーネント。 |
| b | 単精度浮動小数点数 | 青色コンポーネント。 |

### ReturnValue

新しい色。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(float, float, float) method


scRGB カラースペースで新しい色を作成します。

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(float r, float g, float b)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| r | 単精度浮動小数点数 | 赤色コンポーネント。 |
| g | 単精度浮動小数点数 | 緑色コンポーネント。 |
| b | 単精度浮動小数点数 | 青色コンポーネント。 |

### ReturnValue

新しい色。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(int32_t, int32_t, int32_t, int32_t) method


sRGB カラースペースで新しい色を作成します。

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(int32_t a, int32_t r, int32_t g, int32_t b)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| a | int32_t | アルファ色成分。 |
| r | int32_t | 赤色コンポーネント。 |
| g | int32_t | 緑色コンポーネント。 |
| b | int32_t | 青色コンポーネント。 |

### ReturnValue

新しい色。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(int32_t, int32_t, int32_t) method


sRGB カラースペースで新しい色を作成します。

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(int32_t r, int32_t g, int32_t b)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| r | int32_t | 赤色コンポーネント。 |
| g | int32_t | 緑色コンポーネント。 |
| b | int32_t | 青色コンポーネント。 |

### ReturnValue

新しい色。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::Drawing::Color) method


新しい色を作成します。

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::Drawing::Color color)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| color | System::Drawing::Color | RGBカラー用のネイティブカラーインスタンスです。 |

### ReturnValue

新しい色。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [Color](../../../system.drawing/color/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) method


ICC ベースのカラースペースで新しい色を作成します。

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::SharedPtr<XpsModel::XpsIccProfile> iccProfile, const System::ArrayPtr<float> &components)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| iccProfile | System::SharedPtr\<XpsModel::XpsIccProfile\> | ICCプロファイルリソースです。 |
| コンポーネント | const System::ArrayPtr\<float\>\& | カラーコンポーネント。 |

### ReturnValue

新しい色。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::String, const System::ArrayPtr\<float\>\&) method


ICC ベースのカラースペースで新しい色を作成します。

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::String path, const System::ArrayPtr<float> &components)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | System::String | ICCプロファイルへのパスです。 |
| コンポーネント | const System::ArrayPtr\<float\>\& | カラーコンポーネント。 |

### ReturnValue

新しい色。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
