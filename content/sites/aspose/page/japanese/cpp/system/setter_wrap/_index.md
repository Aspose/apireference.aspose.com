---
title: "System::setter_wrap メソッド"
linktitle: "setter_wrap"
second_title: "C++ 用 Aspose.Page"
description: "System::setter_wrap メソッド。C++ における型変換付きインスタンス setter 関数のオーバーロードです。"
type: docs
weight: 38200
url: /ja/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


型変換付きインスタンス setter 関数のオーバーロード。

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| パラメーター | 説明 |
| --- | --- |
| T | 値型です。 |
| T2 | setter 関数が期待する型。 |
| Host | インスタンス型。 |
| HostSet | - プロパティの setter が定義されているホスト自身、またはその基底型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| host | Host *const | [Object](../object/) の setter 関数を呼び出すために。 |
| pSetter | void(HostSet::*)(T2) | setter 関数への参照。 |
| value | T | 設定する値。 |

### ReturnValue

値を設定する。

## 参照

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


型変換を伴う静的 setter 関数のオーバーロード。

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| パラメーター | 説明 |
| --- | --- |
| T | 値型です。 |
| T2 | setter 関数が期待する型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| pSetter | void(*)(T2) | 静的 setter 関数への参照。 |
| value | T | 設定する値。 |

### ReturnValue

値を設定する。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
