---
title: "System::Threading 名前空間"
linktitle: "System::Threading"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::Threading 名前空間を使用する方法。"
type: docs
weight: 6500
url: /ja/cpp/system.threading/
---



## クラス

| クラス | 説明 |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/) は待機中のスレッドに自動的にリセットされることを通知します。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
| [CancellationToken](./cancellationtoken/) | 操作をキャンセルすべきであるという通知を伝搬します。このクラスはスレッド間で協調的なキャンセルを行うメカニズムを提供し、あるスレッドが他のスレッドに対して操作をキャンセルすべきであることを通知できるようにします。 |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | キャンセル トークン コールバックの登録を表します。 |
| [CancellationTokenSource](./cancellationtokensource/) | キャンセル通知をトリガーするために使用できるキャンセル トークン ソースです。 |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/) は待機中のスレッドに送信できるイベントです。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
| [Interlocked](./interlocked/) | スレッドセーフな操作のための API を提供します。これはインスタンスサービスを持たない静的型です。いかなる手段でもインスタンスを作成してはいけません。 |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) は自動的にリセットされない待機スレッドに通知するためのものです。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
| [Monitor](./monitor/) | クラス [Monitor](./monitor/) はオブジェクトへのアクセスを同期させるメカニズムを提供します。 |
| [Mutex](./mutex/) | [Mutex](./mutex/) の実装。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) の実装。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
| [SynchronizationContext](./synchronizationcontext/) | さまざまな同期操作間で同期コンテキストを伝播させる基本機能を提供します。 |
| [Thread](./thread/) | [Thread](./thread/) の実装。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
| [ThreadPool](./threadpool/) | [Thread](./thread/) プール API はジョブをキューにプッシュし、ワーカースレッドのプールで取得できるようにします。これはインスタンスサービスを持たない静的型です。いかなる手段でもインスタンスを作成してはいけません。 |
| [ThreadPoolImpl](./threadpoolimpl/) | [Thread](./thread/) プールの内部データ。これはアクセス関数によってメモリ管理が行われるシングルトン型です。直接インスタンスを作成してはいけません。 |
| [Timer](./timer/) | [Timer](./timer/) クラスは遅延後に別スレッドでジョブ項目を実行します。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
| [TimerQueue](./timerqueue/) | [Timer](./timer/) オブジェクトを処理するキューです。これは単なる実装です。[Timer](./timer/) オブジェクトは自動的にそこに登録されるので、使用するために手動で登録する必要はありません—代わりに [Timer](./timer/) クラス API を使用してください。これはアクセス関数によってメモリ管理が行われるシングルトン型です。直接インスタンスを作成してはいけません。 |
| [WaitHandle](./waithandle/) | 待機プリミティブの基底クラス。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
## Enums

| 列挙型 | 説明 |
| --- | --- |
| [ApartmentState](./apartmentstate/) | スレッドのアパートメント状態を設定します。 |
| [EventResetMode](./eventresetmode/) | イベント状態のリセット方法を示します。 |
| [ThreadState](./threadstate/) | スレッドの状態。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | [Thread](./thread/) 関数（単一パラメータ）。 |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | [Thread](./thread/) 関数（パラメータなし）。 |
| [TimerCallback](./timercallback/) | タイマーによって呼び出されるコールバック関数。 |
| [wait_handle_t](./wait_handle_t/) | ハンドル型。 |
| [WaitCallback](./waitcallback/) | 空きができたときに実行されるコールバック項目。 |
