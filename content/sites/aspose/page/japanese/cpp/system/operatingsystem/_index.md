---
title: "System::OperatingSystem クラス"
linktitle: "OperatingSystem"
second_title: "C++ 用 Aspose.Page"
description: "System::OperatingSystem クラス。特定のオペレーティングシステムを表し、その情報を提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を用いてこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 5100
url: /ja/cpp/system/operatingsystem/
---
## OperatingSystem class


特定のオペレーティングシステムを表し、その情報を提供します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を用いてこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class OperatingSystem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Platform](./get_platform/)() const | 現在のオブジェクトが表すオペレーティングシステムのプラットフォーム識別子を返します。 |
| [get_ServicePack](./get_servicepack/)() const | 現在のオブジェクトが表すオペレーティングシステムのサービスパック名を返します。 |
| [get_Version](./get_version/)() const | 現在のオブジェクトが表すオペレーティングシステムのバージョンを表す [Version](../version/) オブジェクトへの定数参照を返します。 |
| [get_VersionString](./get_versionstring/)() const | 現在のオブジェクトが表すオペレーティングシステムのバージョンの文字列表現を返します。 |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&) | 特定のプラットフォーム ID とバージョンで指定されたオペレーティングシステムを表すインスタンスを構築します。 |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&, const String\&) | 特定のプラットフォーム ID、バージョン、サービスパックで指定されたオペレーティングシステムを表すインスタンスを構築します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトが表すオペレーティングシステムのバージョンの文字列表現を返します。 |
## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
