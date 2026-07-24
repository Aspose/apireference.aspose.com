---
title: "System::Net::Security::SslStream クラス"
linktitle: "SslStream"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Security::SslStream クラス。C++ でサーバーを認証し、必要に応じてクライアントも認証する SSL プロトコルを使用するストリームです。"
type: docs
weight: 200
url: /ja/cpp/system.net.security/sslstream/
---
## SslStream class


サーバーと（オプションで）クライアントを認証するために SSL プロトコルを使用するストリームです。

```cpp
class SslStream : public System::Net::Security::AuthenticatedStream
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String) | 接続のクライアント側を認証します。 |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) | 接続のクライアント側を認証します。 |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | 非同期読み取り操作を開始します。 |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | 非同期書き込み操作を開始します。 |
| [Close](./close/)() override | ストリームを閉じます。 |
| [Dispose](./dispose/)(bool) override | 現在のオブジェクトが使用しているすべてのリソースを解放し、ストリームを閉じます。 |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | 指定された非同期読み取り操作が完了するまで待機します。 |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | 非同期書き込み操作を終了します。指定された非同期書き込み操作が完了するまで待機します。 |
| [Flush](./flush/)() override | このストリームのバッファをクリアし、バッファされたすべてのデータを書き込み先のストレージに書き込みます。 |
| [get_CanRead](./get_canread/)() const override | ストリームが読み取り可能かどうかを判断します。 |
| [get_CanSeek](./get_canseek/)() const override | ストリームがシークをサポートしているかどうかを判断します。 |
| [get_CanTimeout](./get_cantimeout/)() const override | 現在のストリームがタイムアウトできるかどうかを決定する値を取得します。 |
| [get_CanWrite](./get_canwrite/)() const override | ストリームが書き込み可能かどうかを判断します。 |
| virtual [get_CheckCertRevocationStatus](./get_checkcertrevocationstatus/)() | 証明書検証プロセス中に証明書失効リストがチェックされるかどうかを示す値を返します。 |
| virtual [get_CipherAlgorithm](./get_cipheralgorithm/)() | 暗号化アルゴリズムを返します。 |
| virtual [get_CipherStrength](./get_cipherstrength/)() | 使用されている暗号化アルゴリズムの強度を返します。 |
| virtual [get_HashAlgorithm](./get_hashalgorithm/)() | ハッシュアルゴリズムを返します。 |
| virtual [get_HashStrength](./get_hashstrength/)() | 使用されているハッシュアルゴリズムの強度を返します。 |
| [get_IsAuthenticated](./get_isauthenticated/)() const override | 認証が正常に行われたかどうかを示す値を返します。 |
| [get_IsEncrypted](./get_isencrypted/)() const override | このストリームを使用して送信されたデータが暗号化されているかどうかを示す値を返します。 |
| [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const override | サーバーとクライアントが認証されているかどうかを示す値を返します。 |
| [get_IsServer](./get_isserver/)() const override | 接続のローカル側がサーバーであるかどうかを示す値を返します。 |
| [get_IsSigned](./get_issigned/)() const override | このストリームを使用して送信されたデータが署名されているかどうかを示す値を返します。 |
| virtual [get_KeyExchangeStrength](./get_keyexchangestrength/)() | 使用されている鍵交換アルゴリズムの強度を返します。 |
| [get_Length](./get_length/)() const override | ストリームの長さ（バイト単位）を返します。 |
| virtual [get_LocalCertificate](./get_localcertificate/)() | ローカルエンドポイントの認証に使用される証明書を返します。 |
| [get_Position](./get_position/)() const override | ストリームの現在位置を返します。 |
| [get_ReadTimeout](./get_readtimeout/)() const override | ミリ秒単位で、ストリームがタイムアウトするまでに読み取りを試みる時間を決定する値を取得します。 |
| virtual [get_RemoteCertificate](./get_remotecertificate/)() | リモートエンドポイントの認証に使用される証明書を返します。 |
| virtual [get_SslProtocol](./get_sslprotocol/)() | SSL プロトコルを返します。 |
| [get_WriteTimeout](./get_writetimeout/)() const override | ミリ秒単位で、ストリームがタイムアウトするまで書き込みを試みる時間を決定する値を取得します。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | 現在のオブジェクトが表すストリームの位置を設定します。 |
| [set_Position](./set_position/)(int64_t) override | ストリームの位置を設定します。 |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | 現在のストリームがタイムアウトできるかどうかを決定する値を設定します。 |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | ミリ秒単位で、ストリームがタイムアウトするまで読み取りを試みる時間を決定する値を設定します。 |
| [SetLength](./setlength/)(int64_t) override | 現在のオブジェクトが表すストリームの長さを設定します。 |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>) | 新しいインスタンスを構築します。 |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool) | 新しいインスタンスを構築します。 |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) | 新しいインスタンスを構築します。 |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) | 新しいインスタンスを構築します。 |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) | 新しいインスタンスを構築します。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&) | 指定されたバイト配列を書き込みます。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&) | 指定されたバイト配列を書き込みます。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Null](../../system.io/stream/null/) | 基盤となるストレージを持たないストリームです。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [AsyncResultType](./asyncresulttype/) | RTTI 情報。 |
| [StreamImplementationPtr](./streamimplementationptr/) | 実装へのポインタの型です。 |
## 参照

* Class [AuthenticatedStream](../authenticatedstream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
