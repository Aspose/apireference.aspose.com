---
title: "System::Web::Services::Protocols::SoapMessage クラス"
linktitle: "SoapMessage"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::Services::Protocols::SoapMessage クラス。SOAP メッセージを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上で、または operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 1000
url: /ja/cpp/system.web.services.protocols/soapmessage/
---
## SoapMessage class


SOAP メッセージを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上で、または operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class SoapMessage : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CollectHeaders](./collectheaders/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, SoapHeaderDirection) | SOAP ヘッダーの内部コレクションを設定します。 |
| [FindHeader](./findheader/)(System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, const TypeInfo\&) | 指定されたヘッダータイプでヘッダーのマッピングを検索します。 |
| virtual [get_Action](./get_action/)() | 'SOAPAction' 属性の値を返します。 |
| [get_ContentEncoding](./get_contentencoding/)() | 'Content-Encoding' ヘッダーの値を取得します。 |
| [get_ContentType](./get_contenttype/)() | 'Content-Type' ヘッダーの値を取得します。 |
| [get_Exception](./get_exception/)() | XML [Web](../../system.web/) サービス メソッドによってスローされる例外を取得します。 |
| [get_Headers](./get_headers/)() | SOAP ヘッダーのコレクションを返します。 |
| [get_InParameters](./get_inparameters/)() | XML [Web](../../system.web/) サービス メソッドに渡されるパラメーターを取得します。 |
| [get_IsSoap12](./get_issoap12/)() | SOAP バージョン 1.2 が使用されているかどうかを示す値を返します。 |
| [get_OutParameters](./get_outparameters/)() | XML [Web](../../system.web/) サービス メソッドに渡される出力パラメーターを取得します。 |
| virtual [get_SoapVersion](./get_soapversion/)() | 使用されている SOAP バージョンを返します。 |
| [get_Stage](./get_stage/)() | SOAP メッセージの処理段階を取得します。 |
| [get_Stream](./get_stream/)() | SOAP メッセージ データを含むストリームを取得します。 |
| virtual [get_Url](./get_url/)() | XML [Web](../../system.web/) サービスの URL を返します。 |
| [GetInParameterValue](./getinparametervalue/)(int32_t) | 指定されたインデックスの入力パラメーター値を取得します。 |
| [GetOutParameterValue](./getoutparametervalue/)(int32_t) | 指定されたインデックスの出力パラメーター値を取得します。 |
| [GetReturnValue](./getreturnvalue/)() | XML [Web](../../system.web/) サービス メソッドの戻り値を取得します。 |
| [set_ContentEncoding](./set_contentencoding/)(String) | 'Content-Encoding' ヘッダーの値を設定します。 |
| [set_ContentType](./set_contenttype/)(String) | 'Content-Type' ヘッダーの値を設定します。 |
| [set_InParameters](./set_inparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | XML [Web](../../system.web/) サービス メソッドに渡されるパラメーターを設定します。 |
| [set_InternalStream](./set_internalstream/)(System::SharedPtr\<System::IO::Stream\>) | SOAP メッセージ データを含むストリームを設定します。 |
| [set_OutParameters](./set_outparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | XML [Web](../../system.web/) サービス メソッドに渡される出力パラメーターを設定します。 |
| [SetException](./setexception/)(SoapException) | XML [Web](../../system.web/) サービス メソッドによってスローされる例外を設定します。 |
| [SetHeaders](./setheaders/)(System::SharedPtr\<SoapHeaderCollection\>) | SOAP ヘッダーのコレクションを設定します。 |
| [SetStage](./setstage/)(SoapMessageStage) | SOAP メッセージの処理段階を設定します。 |
| [SetStream](./setstream/)(System::SharedPtr\<System::IO::Stream\>) | SOAP メッセージ データを含むストリームを設定します。 |
| [SoapMessage](./soapmessage/)() | 新しいインスタンスを構築します。 |
| [UpdateHeaderValues](./updateheadervalues/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>) | SOAP ヘッダーの内部コレクションを更新します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
