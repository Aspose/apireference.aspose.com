---
title: "System::Equals< float, float > विधि"
linktitle: "बराबर< float, float >"
second_title: "Aspose.Page C++ के लिए"
description: "System::Equals< float, float > विधि। सिंगल-प्रिसीजन फ्लोटिंग पॉइंट मानों के लिए विशेषीकरण। यद्यपि दो फ्लोटिंग पॉइंट NaN को IEC 60559:1989 द्वारा हमेशा असमान माना जाता है, System.Object.Equals के अनुबंध के अनुसार, ओवरराइड्स को समतुल्य ऑपरेटर की आवश्यकताओं को पूरा करना चाहिए। इसलिए, System.Double.Equals और System.Single.Equals दो NaN की तुलना करते समय True लौटाते हैं, जबकि उस स्थिति में समानता ऑपरेटर False लौटाता है, जैसा कि C++ में मानक द्वारा आवश्यक है।"
type: docs
weight: 18400
url: /hi/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


सिंगल-प्रिसीजन फ्लोटिंग पॉइंट मानों के लिए विशेषीकरण। यद्यपि दो फ्लोटिंग पॉइंट NaN को IEC 60559:1989 द्वारा हमेशा असमान माना जाता है, [System.Object.Equals](../object/equals/) के अनुबंध के अनुसार, ओवरराइड्स को समतुल्य ऑपरेटर की आवश्यकताओं को पूरा करना चाहिए। इसलिए, System.Double.Equals और System.Single.Equals दो NaN की तुलना करते समय True लौटाते हैं, जबकि उस स्थिति में समानता ऑपरेटर False लौटाता है, जैसा कि मानक द्वारा आवश्यक है।

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| एक | const float\& | पहला तुलनात्मक मान |
| b | const float\& | दूसरा तुलनात्मक मान |

### ReturnValue

यदि दोनों मान NaN हैं या समान हैं तो सत्य, अन्यथा - असत्य

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
