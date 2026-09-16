# Rushani Latin Keyboard Pack for AnySoftKeyboard

A keyboard add-on pack for [AnySoftKeyboard (ASK)](https://anysoftkeyboard.github.io/)
that enables typing in **Rushani** using the **Latin orthography** (Karamshoyev system).

---

## What's included

| File | Purpose |
|---|---|
| `res/xml/rushani_latin_keyboard.xml` | Main QWERTY-based layout |
| `res/xml/rushani_symbols.xml` | Numbers + symbols layer |
| `res/xml/keyboards.xml` | Registers the layout with ASK |
| `res/values/strings.xml` | Display names |
| `AndroidManifest.xml` | Android package descriptor |
| `src/.../RushaniLatinPackStub.java` | Required ASK discovery stub |

---

## Special characters & long-press access

All Rushani-specific characters are accessible by **long-pressing** the nearest
base key on the main keyboard:

| Long-press key | Characters available |
|---|---|
| `a` | ā Ā |
| `e` | ê Ê |
| `i` | ī Ī |
| `o` | ō Ō |
| `u` | ū ū Ů ů |
| `s` | š Š |
| `z` | ž Ž |
| `c` | č Č |
| `d` | δ Δ |
| `t` | θ Θ |
| `x` | x̌ X̌ ɣ Ɣ |
| `g` | ɣ̌ Ɣ̌ |

The characters **ʒ** and **ǰ** have their own dedicated keys on row 2
(between `h` and `k`).

All special characters are also available on the **symbols layer** (tap `?123`).

---

## How to build

### Requirements
- [Android Studio](https://developer.android.com/studio) (Hedgehog 2023.1.1 or later)
- Android SDK (API 34)
- Java 8+

### Steps

1. **Open the project** in Android Studio:
   `File → Open → select the rushani-ask-pack folder`

2. **Add a placeholder icon** (required to build):
   Place a 48×48 PNG named `ic_keyboard_rushani.png` in:
   `res/drawable/`
   (You can use any simple image for testing — a coloured square works fine.)

3. **Build the APK**:
   `Build → Build Bundle(s) / APK(s) → Build APK(s)`
   The APK will appear in `app/build/outputs/apk/debug/`

4. **Install on your Android device**:
   ```
   adb install app-debug.apk
   ```
   Or transfer the APK file to your phone and open it
   (enable "Install from unknown sources" in Settings if needed).

5. **Activate in AnySoftKeyboard**:
   - Open AnySoftKeyboard
   - Go to **Settings → Keyboards**
   - Find **"Rushani (Latin)"** and enable it
   - Switch to it using the globe/language key while typing

---

## Character reference (Karamshoyev Latin orthography)

### Vowels
| Latin | Unicode | Notes |
|---|---|---|
| a / A | U+0061 / U+0041 | Basic a |
| ā / Ā | U+0101 / U+0100 | a with macron — long vowel |
| e / E | U+0065 / U+0045 | Basic e |
| ê / Ê | U+00EA / U+00CA | e with circumflex |
| i / I | U+0069 / U+0049 | Basic i |
| ī / Ī | U+012B / U+012A | i with macron — long vowel |
| o / O | U+006F / U+004F | Basic o |
| ō / Ō | U+014D / U+014C | o with macron — long vowel |
| u / U | U+0075 / U+0055 | Basic u |
| ū / Ū | U+016B / U+016A | u with macron — long vowel |
| ů / Ů | U+016F / U+016E | u with ring above |

### Consonants (special)
| Latin | Unicode | Notes |
|---|---|---|
| δ / Δ | U+03B4 / U+0394 | Greek delta |
| θ / Θ | U+03B8 / U+0398 | Greek theta |
| š / Š | U+0161 / U+0160 | s with caron |
| ž / Ž | U+017E / U+017D | z with caron |
| č / Č | U+010D / U+010C | c with caron |
| ǰ / J̌ | U+01F0 / U+004A U+030C | j with caron |
| ʒ / Ʒ | U+0292 / U+01B7 | ezh |
| x̌ / X̌ | U+0078 U+030C / U+0058 U+030C | x with combining caron |
| ɣ / Ɣ | U+0263 / U+0194 | Latin gamma |
| ɣ̌ / Ɣ̌ | U+0263 U+030C / U+0194 U+030C | Latin gamma with combining caron |

---

## Distributing the keyboard

Once built and tested, you can share the APK:
- **Direct download** — host the `.apk` file on a website or send via
  messaging apps. Users install it manually.
- **F-Droid** — F-Droid is an open-source Android app store. Ideal for
  minority language tools. See https://f-droid.org/en/docs/Submitting_to_F-Droid_Quick_Start_Guide/
- **Google Play** — requires a developer account ($25 one-time fee) and
  review process. Broadest reach.

---

## License

This keyboard layout pack is released for free use by the Rushani-speaking
community. You are free to modify and redistribute it.

Rushani orthography based on the Karamshoyev Latin transcription system.
