---
title: "System::Net::Security::AuthenticatedStream class"
linktitle: "AuthenticatedStream"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Security::AuthenticatedStream クラス。ストリームを介して資格情報を渡すためのメソッドを含みます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを関数への引数として使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.net.security/authenticatedstream/
---
## AuthenticatedStream class


ストリームを介して資格情報を渡すためのメソッドを含みます。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class AuthenticatedStream : public System::IO::Stream
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_IsAuthenticated](./get_isauthenticated/)() const | 認証が正常に行われたかどうかを示す値を返します。 |
| virtual [get_IsEncrypted](./get_isencrypted/)() const | このストリームを使用して送信されたデータが暗号化されているかどうかを示す値を返します。 |
| virtual [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const | サーバーとクライアントが認証されているかどうかを示す値を返します。 |
| virtual [get_IsServer](./get_isserver/)() const | 接続のローカル側がサーバーであるかどうかを示す値を返します。 |
| virtual [get_IsSigned](./get_issigned/)() const | このストリームを使用して送信されたデータが署名されているかどうかを示す値を返します。 |
| [get_LeaveInnerStreamOpen](./get_leaveinnerstreamopen/)() const | RTTI 情報。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Null](../../system.io/stream/null/) | 基盤となるストレージを持たないストリームです。 |
## 参照

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
