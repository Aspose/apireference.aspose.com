---
title: Enum ImageLockMode
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Imaging.ImageLockMode 列挙. の flags パラメータに渡されるフラグを指定しますLockBits method. のLockBitsメソッドは image の一部をロックしてピクセル データを読み書きできるようにします
type: docs
weight: 780
url: /ja/net/system.drawing.imaging/imagelockmode/
---
## ImageLockMode enumeration

の flags パラメータに渡されるフラグを指定します。[`LockBits`](../../system.drawing/bitmap/lockbits/) method. の[`LockBits`](../../system.drawing/bitmap/lockbits/)メソッドは image の一部をロックして、ピクセル データを読み書きできるようにします。

```csharp
public enum ImageLockMode
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| ReadOnly | `1` | イメージの一部が読み取り用にロックされていることを指定します。 |
| WriteOnly | `2` | イメージの一部を書き込み用にロックすることを指定します。 |
| ReadWrite | `3` | イメージの一部が読み取りまたは書き込みのためにロックされていることを指定します。 |
| UserInputBuffer | `4` | ピクセル データの読み取りまたは書き込みに使用されるバッファがユーザーによって割り当てられることを指定します。 このフラグが設定されている場合、*flags*のパラメータ[`LockBits`](../../system.drawing/bitmap/lockbits/) メソッドは、入力パラメーター (および場合によっては出力パラメーター) として機能します。 このフラグがクリアされている場合、*flags*パラメータは出力パラメータとしてのみ機能します. |

### 関連項目

* 名前空間 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 組み立て [Aspose.Drawing](../../)


