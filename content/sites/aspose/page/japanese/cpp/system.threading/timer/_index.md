---
title: "System::Threading::Timer class"
linktitle: "Timer"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Timer class。遅延後に別スレッドでジョブ項目を実行するタイマークラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を用いてインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 1500
url: /ja/cpp/system.threading/timer/
---
## Timer class


[Timer](./) class that executes job item in separate thread after delay. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Timer : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Change](./change/)(int64_t, int64_t) | タイマーを再スケジュールまたはキャンセルします。 |
| [Change](./change/)(System::TimeSpan, System::TimeSpan) | タイマーを再スケジュールまたはキャンセルします。 |
| [Dispose](./dispose/)() | タイマーのスケジュールを解除します。 |
| [Timer](./timer/)(TimerCallback) | コンストラクタ。 |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) | コンストラクタ。 |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) | コンストラクタ。 |
## 備考



```cpp
#include "system/threading/thread.h"
#include "system/threading/timer.h"
#include "system/object.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  using namespace System::Threading;

  auto number = 0;
  auto timer = System::MakeObject<Timer>([&number](System::SharedPtr<System::Object> object) -> void {
    std::cout << ++number << std::endl;
  }, nullptr, 0, 200);

  Thread::Sleep(1000);
  timer->Dispose();

  return 0;
}
/*
This code example produces the following output:
1
2
3
4
5
*/
```

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
