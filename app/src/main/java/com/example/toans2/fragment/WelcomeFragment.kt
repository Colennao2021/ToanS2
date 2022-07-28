//package com.example.toans2.fragment
//
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.view.animation.AnimationUtils
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.lifecycle.lifecycleScope
//import androidx.navigation.fragment.findNavController
//import com.example.toans2.R
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.launch
//
//class WelcomeFragment : Fragment() {
//    private lateinit var text_s :TextView
//    private lateinit var number_2 :TextView
//    private lateinit var table :ImageView
//    private lateinit var star :ImageView
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        val view= inflater.inflate(R.layout.fragment_welcome, container, false)
//        text_s=view.findViewById(R.id.text_s)
//        number_2=view.findViewById(R.id.number_2)
//        table=view.findViewById(R.id.table)
//        return view
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val aniLeftRight =AnimationUtils.loadAnimation(requireContext(),R.anim.left_right)
//        val aniRightLeft =AnimationUtils.loadAnimation(requireContext(),R.anim.right_left)
//        val scale =AnimationUtils.loadAnimation(requireContext(),R.anim.stb)
//
//
//        text_s.startAnimation(aniLeftRight)
//        number_2.startAnimation(aniRightLeft)
//        table.startAnimation(scale)
//
//        lifecycleScope.launch {
//            delay(3000)
//            text_s.startAnimation(aniRightLeft)
//            number_2.startAnimation(aniLeftRight)
//            val action=WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
//            findNavController().navigate(action)
//        }
//    }
//}