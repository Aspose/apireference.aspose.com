---
title: "System::Guid::Guid コンストラクタ"
linktitle: "Guid"
second_title: "C++ 用 Aspose.Page"
description: "System::Guid::Guid コンストラクタ。C++ で全てゼロの GUID を表すオブジェクトを構築します。"
type: docs
weight: 100
url: /ja/cpp/system/guid/guid/
---
## Guid::Guid() constructor


すべてゼロの GUID を表すオブジェクトを作成します。

```cpp
System::Guid::Guid()
```

## 参照

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const ArrayPtr\<uint8_t\>\&) constructor


符号なし 8 ビット整数値の配列として指定された GUID を表すオブジェクトを作成します。

```cpp
System::Guid::Guid(const ArrayPtr<uint8_t> &b)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| b | const ArrayPtr\<uint8_t\>\& | GUID の個々のバイトを含むバイト配列 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const Guid\&) constructor


指定されたオブジェクトと同じ GUID を表すオブジェクトを作成します。

```cpp
System::Guid::Guid(const Guid &guid)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| guid | const Guid\& | GUID 値をコピーする元となる [Guid](../) オブジェクト |

## 参照

* Class [Guid](../)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const String\&) constructor


文字列として指定された GUID を表すオブジェクトを作成します。

```cpp
System::Guid::Guid(const String &g)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| g | const String\& | 構築中のオブジェクトが表す GUID の文字列表現 |

## 参照

* Class [String](../../string/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const System::Details::ArrayView\<uint8_t\>\&) constructor


符号なし 8 ビット整数値の配列ビューとして指定された GUID を表すオブジェクトを作成します。

```cpp
System::Guid::Guid(const System::Details::ArrayView<uint8_t> &b)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| b | const System::Details::ArrayView\<uint8_t\>\& | GUID の個々のバイトを含むバイト配列 |

## 参照

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) constructor


指定された GUID コンポーネントから [Guid](../) クラスのインスタンスを構築します。

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const ArrayPtr<uint8_t> &d)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| a | int32_t | GUID のビット 0-31 |
| b | int16_t | GUID のビット 32-47 |
| c | int16_t | GUID のビット 48-63 |
| d | const ArrayPtr\<uint8_t\>\& | GUID のビット 64-127 を含むバイト配列 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) constructor


指定された GUID コンポーネントから [Guid](../) クラスのインスタンスを構築します。

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const System::Details::ArrayView<uint8_t> &d)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| a | int32_t | GUID のビット 0-31 |
| b | int16_t | GUID のビット 32-47 |
| c | int16_t | GUID のビット 48-63 |
| d | const System::Details::ArrayView\<uint8_t\>\& | GUID のビット 64-127 を含むバイト配列ビュー |

## 参照

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


指定された符号なし整数とバイトから [Guid](../) クラスのインスタンスを構築します。

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| a | int32_t | GUID のビット 0-31 |
| b | int16_t | GUID のビット 32-47 |
| c | int16_t | GUID のビット 48-63 |
| d | uint8_t | GUID のビット 64-71 |
| e | uint8_t | GUID のビット 72-79 |
| f | uint8_t | GUID のビット 80-87 |
| g | uint8_t | GUID のビット 88-95 |
| h | uint8_t | GUID のビット 96-103 |
| i | uint8_t | GUID のビット 104-111 |
| j | uint8_t | GUID のビット 112-119 |
| k | uint8_t | GUID のビット 120-127 |

## 参照

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


指定された符号なし整数とバイトから [Guid](../) クラスのインスタンスを構築します。

```cpp
System::Guid::Guid(uint32_t a, uint16_t b, uint16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| a | uint32_t | GUID のビット 0-31 |
| b | uint16_t | GUID のビット 32-47 |
| c | uint16_t | GUID のビット 48-63 |
| d | uint8_t | GUID のビット 64-71 |
| e | uint8_t | GUID のビット 72-79 |
| f | uint8_t | GUID のビット 80-87 |
| g | uint8_t | GUID のビット 88-95 |
| h | uint8_t | GUID のビット 96-103 |
| i | uint8_t | GUID のビット 104-111 |
| j | uint8_t | GUID のビット 112-119 |
| k | uint8_t | GUID のビット 120-127 |

## 参照

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
