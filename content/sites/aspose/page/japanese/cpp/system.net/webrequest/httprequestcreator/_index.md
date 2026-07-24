---
title: "System::Net::WebRequest::HttpRequestCreator クラス"
linktitle: "HttpRequestCreator"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::WebRequest::HttpRequestCreator クラス。WebRequest クラスのインスタンスを作成します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを関数への引数として使用してください。"
type: docs
weight: 3900
url: /ja/cpp/system.net/webrequest/httprequestcreator/
---
## HttpRequestCreator class


WebRequest クラスのインスタンスを作成します。このクラスのオブジェクトは [System::MakeObject()](../../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class HttpRequestCreator : public System::Net::IWebRequestCreate
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<Uri\>) | 指定された URI を使用して WebRequest クラスの新しいインスタンスを作成します。 |
## 参照

* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
