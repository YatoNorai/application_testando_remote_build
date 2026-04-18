package com.example.application_testando_remote_build

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

class DashboardFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_dashboard, container, false)
}
