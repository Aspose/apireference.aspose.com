---
title: "System::ObjectType::GetType メソッド"
linktitle: "GetType"
second_title: "C++ 用 Aspose.Page"
description: "System::ObjectType::GetType メソッド。typeof() の変換を実装します。C++ のプリミティブ型用のオーバーロードです。"
type: docs
weight: 100
url: /ja/cpp/system/objecttype/gettype/
---
## ObjectType::GetType() method


typeof() の変換を実装します。プリミティブ型用のオーバーロード。

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value &&!std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| パラメーター | 説明 |
| --- | --- |
| T | プリミティブ型。 |

### ReturnValue

指定された型を記述する [TypeInfo](../../typeinfo/) 構造体への const 参照。

## 参照

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() の変換を実装します。列挙型用のオーバーロード。

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| パラメーター | 説明 |
| --- | --- |
| T | プリミティブ型。 |

### ReturnValue

指定された型を記述する [TypeInfo](../../typeinfo/) 構造体への const 参照。

## 参照

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() の変換を実装します。構造体とポインタ用のオーバーロード。

```cpp
template<typename T> static std::enable_if<(!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsBoxable<T>::value)||IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| パラメーター | 説明 |
| --- | --- |
| T | プリミティブ型。 |

### ReturnValue

指定された構造体を記述する [TypeInfo](../../typeinfo/) 構造体への const 参照。

## 参照

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() の変換を実装します。[Nullable](../../nullable/) 用のオーバーロードです。

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| パラメーター | 説明 |
| --- | --- |
| T | [Nullable](../../nullable/) 型。 |

### ReturnValue

指定された構造体を記述する [TypeInfo](../../typeinfo/) 構造体への const 参照。

## 参照

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() の変換を実装します。MutlicastDelegate 用のオーバーロード。

```cpp
template<typename T> static std::enable_if<detail::is_a<T, MulticastDelegate>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| パラメーター | 説明 |
| --- | --- |
| T | MulticastDelegate 型。 |

### ReturnValue

指定された構造体を記述する [TypeInfo](../../typeinfo/) 構造体への const 参照。

## 参照

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() の変換を実装します。構造体とポインタ用のオーバーロード。

```cpp
template<typename T> static std::enable_if<!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&IsBoxable<T>::value &&!detail::is_a<T, MulticastDelegate>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| パラメーター | 説明 |
| --- | --- |
| T | プリミティブ型。 |

### ReturnValue

指定された構造体を記述する、または [SmartPtr](../../smartptr/) が呼び出された場合は指す型を記述する [TypeInfo](../../typeinfo/) 構造体への const 参照。

## 参照

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() の変換を実装します。uint8_t 用のオーバーロード。

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 参照

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() の変換を実装します。char16_t 用のオーバーロードです。

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 参照

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() の変換を実装します。int32_t 用のオーバーロードです。

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 参照

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() の変換を実装します。int64_t 用のオーバーロードです。

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 参照

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() の変換を実装します。bool 用のオーバーロードです。

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 参照

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() の変換を実装します。[Void](../../void/) 用のオーバーロードです。

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## 参照

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const String\&) method


typeof() の変換を実装します。文字列型用のオーバーロード。

```cpp
static const System::TypeInfo & System::ObjectType::GetType(const String &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | プリミティブ型。 |

### ReturnValue

[String](../../string/) 型を記述する [TypeInfo](../../typeinfo/) 構造体への const 参照。

## 参照

* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


typeof() の変換を実装します。スマートポインタ用のオーバーロード。

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | ポインタオブジェクト型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) の [TypeInfo](../../typeinfo/) を取得するためのもの。 |

### ReturnValue

渡されたオブジェクトの最終クラスを記述する [TypeInfo](../../typeinfo/) 構造体への const 参照。

## 参照

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


typeof() の変換を実装します。構造体用のオーバーロード。

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | 構造体型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) の [TypeInfo](../../typeinfo/) を取得するためのもの。 |

### ReturnValue

渡されたオブジェクトの最終クラスを記述する [TypeInfo](../../typeinfo/) 構造体への const 参照。

## 参照

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


typeof() の変換を実装します。例外用のオーバーロード。

```cpp
template<typename T> static std::enable_if<IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | [Exception](../../exception/) 型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) の [TypeInfo](../../typeinfo/) を取得するためのもの。 |

### ReturnValue

渡されたオブジェクトの最終クラスを記述する [TypeInfo](../../typeinfo/) 構造体への const 参照。

## 参照

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T) method


typeof() の変換を実装します。プリミティブ型用のオーバーロード。

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value||std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | プリミティブ型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

渡されたオブジェクトの型を記述する [TypeInfo](../../typeinfo/) 構造体への const 参照。

## 参照

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T) method


typeof() の変換を実装します。[Nullable](../../nullable/) 型用のオーバーロードです。

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | [Nullable](../../nullable/) 型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

渡されたオブジェクトの型を記述する [TypeInfo](../../typeinfo/) 構造体への const 参照。

## 参照

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
