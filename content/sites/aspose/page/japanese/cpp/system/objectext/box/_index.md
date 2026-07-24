---
title: "System::ObjectExt::Box メソッド"
linktitle: "Box"
second_title: "C++ 用 Aspose.Page"
description: "System::ObjectExt::Box メソッド。C++ で文字列値をボックス化します。"
type: docs
weight: 200
url: /ja/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


文字列値をボックス化します。

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | ボックス化する値。 |

### ReturnValue

ソース文字列が null の場合は、ボックス化された値または null。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


列挙型用の実装として、[Object](../../object/) に変換するために値型をボックス化します。

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| パラメーター | 説明 |
| --- | --- |
| T | [Enum](../../enum/) 型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const T\& | [Enum](../../enum/) 値をボックス化します。 |

### ReturnValue

ボックス化された値を保持するオブジェクトへのスマートポインタ。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


非列挙型用の実装として、[Object](../../object/) に変換するために値型をボックス化します。

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| パラメーター | 説明 |
| --- | --- |
| T | 値型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const T\& | ボックス化する値。 |

### ReturnValue

ボックス化された値を保持するオブジェクトへのスマートポインタ。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


[Object](../../object/) に変換するために、[Nullable](../../nullable/) 型をボックス化します。

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| パラメーター | 説明 |
| --- | --- |
| T | 値型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const T\& | ボックス化する値。 |

### ReturnValue

ボックス化された値を保持するオブジェクトへのスマートポインタ。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
