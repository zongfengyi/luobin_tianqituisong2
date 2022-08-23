package com.luobin.utils;

/**
 * 颜文字
 */
public class MemeUtils {

    public static String randomMeme() {

        String[] meme = {"ヾ(≧▽≦*)o ", "q(≧▽≦q)", "ψ(｀∇´)ψ", "（￣︶￣）↗　", "*^____^*",
                "(～￣▽￣)～", "( •̀ ω •́ )✧[]", "~(￣▽￣)~*", "φ(゜▽゜*)♪", "O(∩_∩)O",
                "o(*^＠^*)o", "(✿◡‿◡)", "`(*>﹏<*)′", "(*^▽^*)", "（*＾-＾*）",
                "(*^_^*)", "(❁´◡`❁)", "(≧∇≦)ﾉ", "(´▽`ʃ♡ƪ)", "(●ˇ∀ˇ●)○",
                "( ＾皿＾)っHiahiahia…", "(￣y▽￣)╭ Ohohoho.....", "\\^o^/", "╰(*°▽°*)╯", "(〃￣︶￣)人(￣︶￣〃)",
                "o(*^▽^*)┛o", "o(*￣▽￣*)ブ", "♪(^∇^*)", "(≧∀≦)ゞ", "o(*￣︶￣*)o",
                "(oﾟvﾟ)ノ", "(/≧▽≦)/", "^o^y", "ㄟ(≧◇≦)ㄏ", "o((>ω< ))o",
                "ヾ(≧ ▽ ≦)ゝ", "♪(´▽｀)", "(*^_^*)", "(●'◡'●)", "(p≧w≦q)",
                "o(*￣▽￣*)o", "( •̀ ω •́ )y", "(o゜▽゜)o☆", "ヾ(•ω•`)o", "\\(￣︶￣*\\)",
                "(｡･∀･)ﾉﾞ嗨", "Hi~ o(*￣▽￣*)ブ", "（づ￣3￣）づ╭❤️～", "（＾∀＾●）ﾉｼ", "(づ￣ 3￣)づ",
                "（＾∀＾●）ﾉｼ", "\\(@^0^@)/", "☆⌒(*＾-゜)v THX!!", "||ヽ(*￣▽￣*)ノミ|Ю", "(๑•̀ㅂ•́)و✧",
                "(o゜▽゜)o☆[BINGO!]", "✪ ω ✪", "＜（＾－＾）＞", "(╹ڡ╹ )", "( •̀ .̫ •́ )✧",
                "*★,°*:.☆(￣▽￣)/$:*.°★* 。", "(。・∀・)ノ", "~\\(≧▽≦)/~", "(¬‿¬)", "(⌐■_■)",
                "(　o=^•ェ•)o　┏━┓", "(ง •_•)ง", "o(〃＾▽＾〃)o", "ο(=•ω＜=)ρ⌒☆", "(✿◕‿◕✿)",
                "~(￣▽￣)~*", "(￣﹃￣)", "༼ つ ◕_◕ ༽つ", "o(*////▽////*)q", "( ﹁ ﹁ ) ~→",
                "(❤️ ω ❤️)", "U•ェ•*U", "o(=•ェ•=)m", "~o( =∩ω∩= )m", "m( =∩王∩= )m",
                "(ヘ･_･)ヘ┳━┳"
        };
        int random = getRandom(0, meme.length-1);
        return meme[random];

    }

    /**
     * 获取大于等于min，小于max的随机整数
     * @param min
     * @param max
     * @return
     */
    private static int getRandom(int min, int max){
        return (int)(Math.random() * (max - min)) + min;
    }
}
