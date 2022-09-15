---
title: HatchStyle
second_title: Aspose.Drawing for .NET API Referansı
description: için kullanılabilen farklı kalıpları belirtirHatchBrush nesneler.
type: docs
weight: 300
url: /tr/net/system.drawing.drawing2d/hatchstyle/
---
## HatchStyle enumeration

için kullanılabilen farklı kalıpları belirtirHatchBrush nesneler.

```csharp
public enum HatchStyle
```

### değerler

| İsim | Değer | Tanım |
| --- | --- | --- |
| Horizontal | `0` | Yatay çizgiler deseni. |
| Vertical | `1` | Dikey çizgilerden oluşan bir desen. |
| ForwardDiagonal | `2` | Sol üstten sağ alta çapraz bir çizgi deseni. |
| BackwardDiagonal | `3` | Sağ üstten sol alta çapraz bir çizgi deseni. |
| Cross | `4` | Kesişen yatay ve dikey çizgileri belirtir. |
| DiagonalCross | `5` | Çapraz çapraz çizgiler deseni. |
| Percent05 | `6` | Yüzde 5'lik bir tarama belirtir. Ön plan renginin arka plan rengine oranı 5:100'dür. |
| Percent10 | `7` | Yüzde 10'luk bir tarama belirtir. Ön plan renginin arka plan rengine oranı 10:100'dür. |
| Percent20 | `8` | Yüzde 20'lik bir tarama belirtir. Ön plan renginin arka plan rengine oranı 20:100'dür. |
| Percent25 | `9` | Yüzde 25'lik bir tarama belirtir. Ön plan renginin arka plan rengine oranı 25:100'dür. |
| Percent30 | `10` | Yüzde 30'luk bir tarama belirtir. Ön plan renginin arka plan rengine oranı 30:100'dür. |
| Percent40 | `11` | Yüzde 40'lık bir tarama belirtir. Ön plan renginin arka plan rengine oranı 40:100'dür. |
| Percent50 | `12` | Yüzde 50 tarama belirtir. Ön plan renginin arka plan rengine oranı 50:100'dür. |
| Percent60 | `13` | Yüzde 60'lık bir tarama belirtir. Ön plan renginin arka plan rengine oranı 60:100'dür. |
| Percent70 | `14` | Yüzde 70'lik bir tarama belirtir. Ön plan renginin arka plan rengine oranı 70:100'dür. |
| Percent75 | `15` | Yüzde 75'lik bir tarama belirtir. Ön plan renginin arka plan rengine oranı 75:100'dür. |
| Percent80 | `16` | Yüzde 80 tarama belirtir. Ön plan renginin arka plan rengine oranı 80:100'dür. |
| Percent90 | `17` | Yüzde 90'lık bir tarama belirtir. Ön plan renginin arka plan rengine oranı 90:100'dür. |
| LightDownwardDiagonal | `18` | Üst noktalardan alt noktalara sağa doğru meyilli olan ve birbirine göre yüzde 50 daha yakın aralıklı çapraz çizgileri belirtir.ForwardDiagonal, ancak antialiased değildir. |
| LightUpwardDiagonal | `19` | Üst noktalardan alt noktalara sola doğru meyilli olan ve birbirine göre yüzde 50 daha yakın aralıklı çapraz çizgileri belirtir.BackwardDiagonal, ancak antialiased değiller. |
| DarkDownwardDiagonal | `20` | Üst noktalardan alt noktalara sağa doğru eğimli, birbirine göre yüzde 50 daha yakın aralıklı ve genişliğinin iki katı olan çapraz çizgileri belirtir.ForwardDiagonal. Bu tarama deseni antialiased değildir. |
| DarkUpwardDiagonal | `21` | Üst noktalardan alt noktalara sola eğimli çapraz çizgileri belirtir, birbirine göre yüzde 50 daha yakın aralıklıdır.BackwardDiagonal, ve genişliğinin iki katıdır, ancak çizgiler kenar yumuşatma uygulanmaz. |
| WideDownwardDiagonal | `22` | Üst noktalardan alt noktalara doğru eğimli, tarama stili ile aynı aralığa sahip çapraz çizgileri belirtir.ForwardDiagonal, ve genişliğinin üç katıdır, ancak kenar yumuşatma uygulanmaz. |
| WideUpwardDiagonal | `23` | Üst noktalardan alt noktalara sola eğimli çapraz çizgileri belirtir, tarama stili ile aynı aralığa sahiptirBackwardDiagonal, ve genişliğinin üç katıdır, ancak kenar yumuşatma uygulanmaz. |
| LightVertical | `24` | birbirine göre yüzde 50 daha yakın aralıklı dikey çizgileri belirtir.Vertical. |
| LightHorizontal | `25` | birbirine göre yüzde 50 daha yakın aralıklı yatay çizgileri belirtir.Horizontal. |
| NarrowVertical | `26` | Tarama stilinden birbirine yüzde 75 daha yakın aralıklı dikey çizgileri belirtirVertical (veya birbirine yüzde 25 daha yakınLightVertical). |
| NarrowHorizontal | `27` | Tarama stilinden birbirine yüzde 75 daha yakın aralıklı yatay çizgileri belirtirHorizontal (veya birbirine yüzde 25 daha yakınLightHorizontal). |
| DarkVertical | `28` | birbirine göre yüzde 50 daha yakın aralıklı dikey çizgileri belirtir.Vertical ve genişliğinin iki katıdır. |
| DarkHorizontal | `29` | birbirine göre yüzde 50 daha yakın aralıklı yatay çizgileri belirtir.Horizontal ve genişliğinin iki katıHorizontal. |
| DashedDownwardDiagonal | `30` | Üst noktalardan alt noktalara doğru eğimli kesikli çapraz çizgileri belirtir. |
| DashedUpwardDiagonal | `31` | Üst noktalardan alt noktalara sola eğimli kesikli çapraz çizgileri belirtir. |
| DashedHorizontal | `32` | Kesikli yatay çizgileri belirtir. |
| DashedVertical | `33` | Kesikli dikey çizgileri belirtir. |
| SmallConfetti | `34` | Konfeti görünümüne sahip bir ambarı belirtir. |
| LargeConfetti | `35` | Konfeti görünümünde olan ve daha büyük parçalardan oluşan bir kapağı belirtir.SmallConfetti. |
| ZigZag | `36` | Zigzaglardan oluşan yatay çizgileri belirtir. |
| Wave | `37` | Tildelerden oluşan yatay çizgileri belirtir. |
| DiagonalBrick | `38` | Üst noktalardan alt noktalara doğru sola meyilli katmanlı tuğla görünümüne sahip bir taramayı belirtir. |
| HorizontalBrick | `39` | Yatay katmanlı tuğla görünümüne sahip bir ambarı belirtir. |
| Weave | `40` | Dokunmuş bir malzeme görünümüne sahip bir ambarı belirtir. |
| Plaid | `41` | Ekose malzeme görünümüne sahip bir ambarı belirtir. |
| Divot | `42` | Bölümlerin görünümüne sahip bir taramayı belirtir. |
| DottedGrid | `43` | Her biri kesişen noktalardan oluşan yatay ve dikey çizgileri belirtir. |
| DottedDiamond | `44` | Her biri kesişen noktalardan oluşan ileri çapraz ve geri çapraz çizgileri belirtir. |
| Shingle | `45` | Üst noktalardan alt noktalara doğru eğimli çapraz katmanlı zona görünümüne sahip bir taramayı belirtir. |
| Trellis | `46` | Kafes görünümüne sahip bir ambarı belirtir. |
| Sphere | `47` | Birbirine bitişik olarak yerleştirilmiş kürelerin görünümüne sahip bir ambarı belirtir. |
| SmallGrid | `48` | Tarama stiline göre birbirine yüzde 50 daha yakın olan ve kesişen yatay ve dikey çizgileri belirtirCross. |
| SmallCheckerBoard | `49` | Dama tahtası görünümüne sahip bir taramayı belirtir. |
| LargeCheckerBoard | `50` | boyutunun iki katı olan kareleri olan bir dama tahtası görünümüne sahip bir taramayı belirtir.SmallCheckerBoard. |
| OutlinedDiamond | `51` | Kesişen ancak kenar yumuşatma uygulanmayan ileri çapraz ve geriye doğru çapraz çizgileri belirtir. |
| SolidDiamond | `52` | Çapraz olarak yerleştirilmiş bir dama tahtası görünümüne sahip bir taramayı belirtir. |
| LargeGrid | `4` | Tarama stilini belirtirCross. |
| Min | `0` | Tarama stilini belirtirHorizontal. |
| Max | `4` | Tarama stilini belirtirSolidDiamond. |

### Ayrıca bakınız

* ad alanı [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
